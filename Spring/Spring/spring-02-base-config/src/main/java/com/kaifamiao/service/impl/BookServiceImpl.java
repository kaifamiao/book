package com.kaifamiao.service.impl;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}