package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName; //简单类型的属性
    private int timeout;         //简单类型的属性

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void save() {
        System.out.println("book dao save ... "+this.databaseName + "," + this.timeout);
    }
}