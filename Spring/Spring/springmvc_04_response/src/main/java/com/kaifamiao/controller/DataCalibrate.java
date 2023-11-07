package com.kaifamiao.controller;

import com.kaifamiao.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class DataCalibrate {

    @GetMapping("/from")
    public String showFrom() {
        //  返回一个视图，视图的名字叫做user-from
        return "user-from";
    }

    @PostMapping("/create")
    @ResponseBody
    public Map<String, String> createUser(@Valid User user) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "用户创建成功");
        return response;
    }
}
