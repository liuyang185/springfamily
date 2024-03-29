package com.spring.family.eureka.client.consumer.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemple(){
        return new RestTemplate();
    }
}
