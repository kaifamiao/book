package com.kaifamiao.service.impl;

import com.kaifamiao.advice.MyAdvice;
import com.kaifamiao.model.DeptModel;

public class SubDeptServiceImpl extends DeptServiceImpl{
    @Override
    public void save(DeptModel model) {
        MyAdvice myAdvice = new MyAdvice();
        myAdvice.beforeSaveLog(); //调用save方法前写入日志
        super.save(model);
        myAdvice.afterSaveLog(); //调用save方法后写入日志
    }
}
