package com.hyp.dubbo.consumer.controller;

import com.hyp.dubbo.provider.entity.UserInfo;
import com.hyp.dubbo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getProvideUserInfoById/{id}")
    @ResponseBody
    public UserInfo getProvideUserInfoById(@PathVariable Integer id){
        return userService.getUserInfoById(id);
    }
}
