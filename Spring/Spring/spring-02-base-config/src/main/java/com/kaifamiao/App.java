package com.kaifamiao;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //此处根据bean标签的id属性和name属性的任意一个值来获取bean对象
//        BookService bookService = (BookService) ctx.getBean("service");
//        bookService.save();
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1==bookDao2);
    }
}
