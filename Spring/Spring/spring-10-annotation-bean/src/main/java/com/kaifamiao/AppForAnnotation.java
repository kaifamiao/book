package com.kaifamiao;

import com.kaifamiao.config.SpringConfig;
import com.kaifamiao.dao.BookDao;
import com.kaifamiao.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}