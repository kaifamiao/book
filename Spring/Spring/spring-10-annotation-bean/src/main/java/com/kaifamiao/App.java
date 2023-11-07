package com.kaifamiao;


import com.kaifamiao.dao.BookDao;
import com.kaifamiao.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //获取bean类型
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}