package com.hap.common.permission;

import com.hap.common.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Aspect
@Component
@Slf4j
public class RequestLimitAspect
{
    @Autowired
    HttpServletRequest request;
    @Autowired
    RedisTemplate redisService;

    /**
     * 被此注解标明的方法会被代理
     */
    @Pointcut("@annotation(com.hap.common.permission.IRequestLimit)")
    public void limitPointCut() {

    }

    /**
     *环绕通知拿到方法上RequestLimit注解的2个属性值 以作比较
     */
    @Around("limitPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        IRequestLimit requestLimit = signature.getMethod().getAnnotation(IRequestLimit.class);
        if (requestLimit != null) {
            String key = getCacheKey();
            int limit = requestLimit.limit();
            int time = requestLimit.time();
            cacheOrRefuse(key, limit, time);
        }
        Object result = point.proceed();
        return result;

    }

    /**
     *  ip+url作为资源的key
     */
    private String getCacheKey() {
        String key = getIpAddress(request) + ":" + request.getRequestURI();
        return key;
    }

    /**
     *达到次数 停止服务 Or 访问次数+1
     */
    private void cacheOrRefuse(String key, int limit, int time) {
        if (redisService.hasKey(key)) {
            String count = redisService.opsForValue().get(key).toString();
            int countRequest = Integer.parseInt(count);
            if (countRequest > limit) {
                throw new MyException(5001, "访问次数超过限制");
            } else {
                redisService.opsForValue().increment(key, 1);
            }
        } else {
            redisService.opsForValue().set(key, 1, time);
        }
    }

    /**
     *  获取实际访问者ip
     * 注意 通过ha或者nginx等代理的ip除了最后一次的访问ip 如（ip1,ip2,ip3,）
     * 有可能篡改ip1或p2，只有ip3无法篡改，这时候只能判断ip3，
     * 所以可以根据实际业务可以拿用户信息（比如token里面获取的用户信息）作为访问记录
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
