package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class PageController {
    @Autowired
    private LoginService loginService;
    // 执行登录功能
    @RequestMapping("login.action")
    public String login(){
        return "login";
    }
    @RequestMapping("logintest.action")
    public String logintest(String username,String password) {
        User user = loginService.login(username, password);
        //User user = new User(null,"double","123","hanfeizi",18,1,new Date(),new Date(),new Date());
        if (user != null) {
            return "succ";
        } else {
            return "login";
        }
    }
}
