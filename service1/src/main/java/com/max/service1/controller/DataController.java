package com.max.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/welcome")
    public String Welcome(){
        return "Hello from Service1";
    }
}
