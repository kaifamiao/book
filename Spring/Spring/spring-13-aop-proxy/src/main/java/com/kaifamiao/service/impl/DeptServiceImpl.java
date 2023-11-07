package com.kaifamiao.service.impl;

import com.kaifamiao.dao.DeptDao;
import com.kaifamiao.model.DeptModel;
import com.kaifamiao.service.DeptService;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao ;
    public void setDeptDao(DeptDao deptDao){
        this.deptDao = deptDao;
    }
    public void save(DeptModel model) {
        deptDao.save();
    }
}
