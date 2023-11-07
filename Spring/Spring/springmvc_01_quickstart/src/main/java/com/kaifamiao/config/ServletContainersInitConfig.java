package com.kaifamiao.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //1.加载 SpringMVC 配置类
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    //2.设置由 SpringMVC 的 controller 处理的请求路径
    protected String[] getServletMappings() {
        //所有的请求都交给 SpringMVC 的 controller 处理
        return new String[]{"/"};
    }

    //3.加载 Spring 配置类
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}