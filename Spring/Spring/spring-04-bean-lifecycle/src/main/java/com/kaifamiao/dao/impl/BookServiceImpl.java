package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.dao.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//实现InitializingBean, DisposableBean接口，完成生命周期的控制
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("bookService setBookDao ...");
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    //销毁方法
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }
    //初始化方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}