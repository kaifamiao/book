package com.kaifamiao.controller;

import com.kaifamiao.config.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();
        CustomException customException = null;
        //如果抛出的是系统自定义异常则直接转换
        if (ex instanceof CustomException){
            customException = (CustomException) ex;
        } else {
            // 如果抛出的不是系统自定义异常则重新构建一个系统错误异常
            customException = new CustomException("系统错误");
        }

        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("message", customException.getMessage());

        return modelAndView;
    }
}
