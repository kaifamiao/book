package com.kaifamiao.controller;

import com.kaifamiao.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    //使用视图解析器返回String用于跳转页面
    @RequestMapping("/string")
    @GetMapping("returnStringView")
    public String returnStringView() {
        return "string";
    }

    //使用ModelAndView返回数据，返回的数据是在request中的
    @RequestMapping("/modelandview")
    @GetMapping("returnModelAndView")
    public ModelAndView returnModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello world");
        modelAndView.setViewName("modelandview");
        return modelAndView;
    }

    //无返回值，使用httpServletRequest对象跳转页面，session传输数据
    @RequestMapping("/void")
    @GetMapping("returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/void.jsp").forward(request, response);
        session.setAttribute("message", "hello world");
    }

    //使用重定向跳转页面
    @RequestMapping("/redirect")
    @GetMapping("returnRedirect")
    public String returnRedirect() {
        System.out.println("UserController中的returnRedirect方法执行了...");
        return "redirect:/JSP/redirect.jsp";
    }

    //使用forward跳转页面
    @RequestMapping("/forward")
    @GetMapping("returnForward")
    public String returnForward() {
        System.out.println("UserController中的returnForward方法执行了...");
        return "forward:/WEB-INF/view/forward.jsp";
    }

    //使用ajax异步请求
    @GetMapping("/jsonData")
    @ResponseBody
    public User returnAjax(){
        User user = new User();
        user.setId(1);
        user.setName("kaifamiao");
        return user;
    }

}
