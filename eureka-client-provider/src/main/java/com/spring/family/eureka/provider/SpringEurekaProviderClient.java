package com.spring.family.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class SpringEurekaProviderClient {
    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaProviderClient.class, args);
    }
}
