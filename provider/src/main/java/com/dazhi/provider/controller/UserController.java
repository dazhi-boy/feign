package com.dazhi.provider.controller;

import com.dazhi.api.UserApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController implements UserApi {

    public String getUser(){
        return "张三";
    }
}
