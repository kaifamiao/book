package com.kaifamiao.service.impl;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.dao.UserDao;
import com.kaifamiao.service.BookService;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    //1：创建userDao
    private UserDao userDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    //2：创建setUserDao方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();

        //3：调用save()方法
        userDao.save();
    }
}