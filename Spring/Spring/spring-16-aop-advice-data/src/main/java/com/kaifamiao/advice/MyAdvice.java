package com.kaifamiao.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution( String com.kaifamiao.dao.BookDao.findName(int))")
    private void pt(){}

    @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ..." );
    }

    @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    @AfterReturning(value = "pt()",returning = "result")
    public void afterReturning(JoinPoint jp,Object result) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("afterReturning advice ...");
        System.out.println(result);
    }


//    @AfterThrowing("pt()")
//    public void afterThrowing(JoinPoint jp) {
//        Object[] args = jp.getArgs();
//        System.out.println(Arrays.toString(args));
//        System.out.println("afterThrowing advice ...");
//    }

    //捕获异常
    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..."+ t);
    }

    //无参数proceed()方法
//    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable{
//        Object[] args = pjp.getArgs();
//        System.out.println(Arrays.toString(args));
//        Object ret = pjp.proceed();
//        return ret;
//    }

    //捕获异常
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object ret= null;
        try {
            ret = pjp.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        return ret;
    }

    //有参数proceed(Object[] args)方法
//    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable{
//        Object[] args = pjp.getArgs();
//        System.out.println(Arrays.toString(args));
//        args[0]= 2;
//        Object ret = pjp.proceed(args);
//        return ret;
//    }

}