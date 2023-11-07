package com.kaifamiao.dao;

import com.kaifamiao.dao.impl.OrderDaoImpl;

//静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}