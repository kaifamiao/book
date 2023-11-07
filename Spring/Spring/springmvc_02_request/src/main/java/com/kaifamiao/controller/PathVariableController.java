package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathVariableController {

    @GetMapping("/user/{userId}")
    public String getUserProfile(@PathVariable Long userId, Model model) {
        // 模拟根据 userId 获取用户信息的操作
        String userName = "User" + userId;
        model.addAttribute("userName", userName);
        return "profile"; // 返回视图名称
    }
}
