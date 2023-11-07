package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SessionController {

    @GetMapping("/addToSession")
    public String addToSession(HttpSession session, Model model){
        //处理请求，将数据添加到HttpSession中
        session.setAttribute("username", "kaifamiao");

        return "addToSessionResult";
    }

    @GetMapping("/getToSession")
    public String getSessionData(HttpSession session, Model model){
        //处理请求，将数据添加到HttpSession中
        String username = (String) session.getAttribute("username");
        model.addAttribute("username", username);

        return "getSessionResult";
    }
}
