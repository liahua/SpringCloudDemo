package com.jt.springcloud1comsumer8020.controller;

import com.jt.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Controller
public class UserController {
    private static final String provider_url = "http://LIAHUA";6

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        return restTemplate.getForObject(provider_url + "/findAll", List.class);
    }

    @RequestMapping("/saveUser/{name}/{age}/{sex}")
    @ResponseBody
    public String saveUser(User user) {
        /**
         * 参数介绍
         * 1.url 访问服务端url路径
         * 2.request 传递的参数   json数据
         * 3.responseType 服务端返回数据类型
         */
        return restTemplate.postForObject(provider_url+"/saveUser", user, String.class);
    }
}
