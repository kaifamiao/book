package com.kaifamiao.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.kaifamiao.dao.BookDao.update())")
    private void pt(){}

    @Pointcut("execution(int com.kaifamiao.dao.BookDao.select())")
    private void ps(){}

    //@Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }
    //@After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }
    //@Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around before advice ...");
        pjp.proceed();//表示对原始操作的调用
        System.out.println("around after advice ...");
    }

    @AfterReturning("ps()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
    @AfterThrowing(pointcut = "pt()", throwing = "ex")
    public void afterThrowing(Exception ex) {
        System.out.println("afterThrowing advice ...");
        System.out.println("Exception message: " + ex.getMessage());
    }

    //@Around("ps()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        Object result = pjp.proceed();//表示对原始操作的调用
        System.out.println("around after advice ...");
        return result;
    }
}
