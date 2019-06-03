package com.itheima.mapper;


import com.itheima.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
@Transactional
public class UserMapperTest {
    @Autowired
    private  UserMapper userMapper;
    @Test
    public void  ad() {
        User user = new User(null,"韩飞","123","hanfeizi",18,1,new Date(),new Date(),new Date());
        userMapper.add(user);
        userMapper.add(user);
        System.out.println("niha");
    }

}
