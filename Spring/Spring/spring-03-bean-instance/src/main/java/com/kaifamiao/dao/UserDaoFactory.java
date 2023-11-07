package com.kaifamiao.dao;

import com.kaifamiao.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}