package com.jt.springcloud1provider8000.controller;

import com.jt.springcloud.pojo.User;
import com.jt.springcloud1provider8000.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    //实现用户入库
    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "用户新增完成8000:"+user.getName();
    }


}
