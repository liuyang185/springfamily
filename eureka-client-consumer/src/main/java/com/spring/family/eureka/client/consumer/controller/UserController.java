package com.spring.family.eureka.client.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/client")
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getuser/{name}")
    public Object getHomePageUrl(@PathVariable("name") String name){
        return restTemplate.getForObject("http://provider-client1/user/page/"+name,String.class);
    }
}
