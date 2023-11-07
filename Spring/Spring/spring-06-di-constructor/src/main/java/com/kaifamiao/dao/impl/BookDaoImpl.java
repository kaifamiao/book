package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String databaseName;
    private int timeout;

//    public void save() {
//        System.out.println("book dao save ...");
//    }
public BookDaoImpl(String databaseName, int timeout) {
    this.databaseName = databaseName;
    this.timeout = timeout;
}

    public void save() {
        System.out.println("book dao save ..." + this.databaseName + ","+ this.timeout);
    }
}