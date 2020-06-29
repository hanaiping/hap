package com.hap.common.permission;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface LocalLock {

    /**
     * 有效时间(请求接口的最短时间间隔/毫秒)
     *
     * @return
     */
    int expire() default 1000;
}
