package com.hap.api.center;

import com.hap.common.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户相关接口", tags = "用户相关接口")
public interface UserControllerApi {
    //基本查询
    @ApiOperation("分页查询页面列表")
    public Response findList(int id);
}
