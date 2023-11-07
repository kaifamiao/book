package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieValueController {
    @GetMapping("/getCookie")
    public String getCookieValue(@CookieValue(value = "username", defaultValue = "Guest") String username) {
        System.out.println("Username from Cookie: " + username);
        return "cookie-details";
    }
}
