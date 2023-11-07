package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("BookDaoImpl constructor ...");
    }
    public void save() {
        System.out.println("book dao save ..." );
    }
}
