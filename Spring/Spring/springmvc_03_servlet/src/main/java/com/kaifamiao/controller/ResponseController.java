package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResponseController {

    @GetMapping("/handleResponse")
    public String handleResponse(Model model){
        //在这里处理模型，将结果添加到模型
        String message = "这是一个response响应信息";
        model.addAttribute("message", message);

        //返回视图名
        return "responseView";
    }
}