package com.kaifamiao;


import com.kaifamiao.dao.BookDao;
import com.kaifamiao.dao.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注册钩子，代替close()方法
        ctx.registerShutdownHook();
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        //ctx.close();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
