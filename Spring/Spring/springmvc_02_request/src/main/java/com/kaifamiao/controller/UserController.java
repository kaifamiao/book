package com.kaifamiao.controller;

import com.kaifamiao.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name, int age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return "{'info':'param'}";
    }

    @RequestMapping("/find")
    @ResponseBody
    public String find(@RequestParam("username") String name, @RequestParam("userage") int age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return "{'info':'param'}";
    }

    @RequestMapping("/search")
    @ResponseBody
    public String search(UserModel user){
        System.out.println("user = " + user);
        return "{'info':'param'}";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(UserModel user){
        System.out.println("user = " + user);
        return "{'info':'param'}";
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(String[] hobby){
        System.out.println(" hobby = " + Arrays.toString(hobby));
        return "{'info':'param'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam List<String> id){
        System.out.println("id = " + id);
        return "{'info':'param'}";
    }

    @ResponseBody
    @RequestMapping("/listPojoParamForJson")
    public String listPojoParamForJson(@RequestBody List<UserModel> list){
        System.out.println("list = " + list);
        return "{'info':'param'}";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody UserModel user){
        System.out.println("user = " + user);
        return "{'info':'param'}";
    }

}
