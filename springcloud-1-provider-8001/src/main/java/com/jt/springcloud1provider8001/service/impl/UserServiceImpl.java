package com.jt.springcloud1provider8001.service.impl;

import com.jt.springcloud.pojo.User;
import com.jt.springcloud1provider8001.mapper.UserMapper;
import com.jt.springcloud1provider8001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return  userMapper.selectList(null);
    }

    @Override
    public void saveUser(User user) {
        System.out.println("user = [" + user + "]");
    }
}
