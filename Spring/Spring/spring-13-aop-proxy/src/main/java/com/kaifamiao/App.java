package com.kaifamiao;


import com.kaifamiao.dao.DeptDao;
import com.kaifamiao.dao.impl.DeptDaoImpl;
import com.kaifamiao.model.DeptModel;
import com.kaifamiao.service.impl.DeptServiceImpl;
import com.kaifamiao.service.impl.SubDeptServiceImpl;

public class App {
    public static void main( String[] args ) {
        DeptModel model =new DeptModel("开发部");
        DeptDao deptDao = new DeptDaoImpl();
        //DeptServiceImpl service = new DeptServiceImpl();
        DeptServiceImpl service = new SubDeptServiceImpl();
        service.setDeptDao(deptDao);
        service.save(model);
    }
}
