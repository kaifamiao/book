package com.kaifamiao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Test {

@Pointcut("execution(* com.kaifamiao.dao.impl.BookDaoImpl.update(*))")
//匹配com.kaifamiao.dao.impl.BookDaoImpl中只有一个参数的update方法，不考虑其返回值。

    public void demo(){

    }
}
