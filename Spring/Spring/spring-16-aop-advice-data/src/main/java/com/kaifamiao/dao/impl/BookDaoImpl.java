package com.kaifamiao.dao.impl;

import com.kaifamiao.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id) {
        System.out.println("id:"+id);
        return "kaifamiao";
    }
}
