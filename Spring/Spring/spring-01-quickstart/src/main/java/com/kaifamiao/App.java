package com.kaifamiao;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        //获取IOC容器，ctx对象就是IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从IOC容器中获取BookDao对象
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        //从IOC容器中获取BookService对象
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }

}

