package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class SessionAttributeController {
    @GetMapping("/set")
    public String addSession(HttpSession session){
        session.setAttribute("name","kaifamiao");
        return "user-from";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session, @SessionAttribute("name") String name){
        System.out.println("name = " + name);
        return "user-details";
    }
}
