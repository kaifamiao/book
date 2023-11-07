package com.kaifamiao.service.impl;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.dao.UserDao;
import com.kaifamiao.service.BookService;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

//    public BookServiceImpl(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//
//    public void save() {
//        System.out.println("book service save ...");
//        bookDao.save();
//    }
public BookServiceImpl(BookDao bookDao,UserDao userDao) {
    this.bookDao = bookDao;
    this.userDao = userDao;
}

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}