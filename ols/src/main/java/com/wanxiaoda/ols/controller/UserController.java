package com.wanxiaoda.ols.controller;

import com.wanxiaoda.ols.Service.UserService;
import com.wanxiaoda.ols.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user_login")
    public User userLogin(int user_id,String password) {
        return userService.userLogin(user_id,password);
    }
}
