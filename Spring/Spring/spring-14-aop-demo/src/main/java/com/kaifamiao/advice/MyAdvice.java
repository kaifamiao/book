package com.kaifamiao.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAdvice {
    //以下两行是定义切入点
    @Pointcut("execution(void com.kaifamiao.dao.BookDao.save())")
    private void ps(){}
    @Pointcut("execution(void com.kaifamiao.dao.BookDao.update())")
    private void pu(){}

    @Before("pu()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}

