package com.kaifamiao.advice;

//通知类advice
public class MyAdvice {
    //Before Advice
    public void beforeSaveLog() {
        System.out.println("准备添加部门");
    }
    //After Advice
    public void afterSaveLog() {
        System.out.println("保存部门完毕");
    }
}
