package com.dazhi.consumer.controller;

import com.dazhi.consumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private ProviderClient providerClient;

    @GetMapping
    public String getUser(){
        return providerClient.getUser();
    }

    /*@Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getUser(){
        return restTemplate.getForObject("http://provider/user", String.class);
    }*/
}
