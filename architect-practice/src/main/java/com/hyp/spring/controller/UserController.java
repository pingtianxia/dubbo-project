package com.hyp.spring.controller;
import com.hyp.spring.bean.UserInfo;
import com.hyp.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 霍云平
 * @包名 com.hyp.spring.controller
 * @日期 2018/11/5 19:20
 * @描述 11
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("getUserInfoById/{id}")
    public UserInfo getUserInfoById(@PathVariable Integer id){
        logger.info("Id=========>"+id);
        return  userService.getUserInfoById(id);
    }
}
