package com.kaifamiao.service.impl;

import com.kaifamiao.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
    public void save() {
        System.out.println("book service save ...");
    }
}