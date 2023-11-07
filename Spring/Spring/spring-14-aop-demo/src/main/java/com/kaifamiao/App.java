package com.kaifamiao;


import com.kaifamiao.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = ctx.getBean(BookDao.class);
        //bookDao.save();
        //bookDao.update();
        System.out.println(bookDao);
        System.out.println(bookDao.getClass());
    }
}
