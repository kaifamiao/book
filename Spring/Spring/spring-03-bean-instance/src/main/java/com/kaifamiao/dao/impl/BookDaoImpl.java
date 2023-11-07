package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;

public class BookDaoImpl implements BookDao {

//    public BookDaoImpl() {
//        System.out.println("book dao constructor is running ...");
//    }
//    private BookDaoImpl() {
//        System.out.println("book dao constructor is running ...");
//}
    private BookDaoImpl(int i) {
        System.out.println("book dao constructor is running ...");
}
    public void save() {
        System.out.println("book dao save ...");
    }
}
