package com.jt.springcloud1provider8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.jt.springcloud1provider8001.mapper")
@SpringBootApplication
@EnableEurekaClient
public class Springcloud1Provider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1Provider8001Application.class, args);
    }

}

