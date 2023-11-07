package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String databaseName;
    private int timeout;

    public void save() {
        System.out.println("book dao save ...");
    }
}