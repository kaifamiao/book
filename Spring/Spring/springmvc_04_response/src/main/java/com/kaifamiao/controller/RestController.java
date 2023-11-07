package com.kaifamiao.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    //使用RestController注解，返回json数据
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
