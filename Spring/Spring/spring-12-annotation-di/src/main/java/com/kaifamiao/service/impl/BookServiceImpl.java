package com.kaifamiao.service.impl;

import com.kaifamiao.dao.BookDao;
import com.kaifamiao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    //@Autowired
    //@Qualifier("bookDao1")
    @Resource(name = "bookDao2")
    private BookDao bookDao;
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}