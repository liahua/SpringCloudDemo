package com.jt.springcloud1comsumer8020.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Bean("restTemplate")
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        return restTemplate;
    }

    @Bean("iRule")
    public IRule myRule() {
        return new RoundRobinRule();
    }
}
