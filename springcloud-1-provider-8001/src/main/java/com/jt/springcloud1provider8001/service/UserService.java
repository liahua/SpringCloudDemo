package com.jt.springcloud1provider8001.service;

import com.jt.springcloud.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void saveUser(User user);
}
