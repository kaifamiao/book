package com.kaifamiao;

import com.kaifamiao.dao.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
//        orderDao.save();

//        //创建实例工厂对象
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        //通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();

        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao1==userDao2);
    }
}
