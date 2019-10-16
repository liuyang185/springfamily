package com.spring.family.eureka.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDiscoveryClient
//@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaClientConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaClientConsumer.class, args);
    }
}
