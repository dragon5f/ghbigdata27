package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User login(@Param("username") String username, @Param("password")String password);
}
