package com.itheima.service;

import com.itheima.pojo.User;
import org.springframework.stereotype.Service;

public interface LoginService {
    public User login(String username,String password);
}
