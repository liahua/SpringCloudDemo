package com.jt.springcloud1comsumer8020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Springcloud1Comsumer8020Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1Comsumer8020Application.class, args);
    }

}

