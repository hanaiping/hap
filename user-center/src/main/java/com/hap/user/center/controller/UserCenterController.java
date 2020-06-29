package com.hap.user.center.controller;

import com.hap.api.center.UserControllerApi;
import com.hap.common.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserCenterController implements UserControllerApi {
    @Override
    public Response findList(int id) {
        return new Response(200, "hello" + id);
    }
}
