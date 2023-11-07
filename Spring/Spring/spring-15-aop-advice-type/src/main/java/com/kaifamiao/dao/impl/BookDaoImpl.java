package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void update(){
        System.out.println("book dao update ...");
        throw new RuntimeException("Update failed!");
    }
    public int select() {
        System.out.println("book dao select is running ...");
        return 100;
    }
}
