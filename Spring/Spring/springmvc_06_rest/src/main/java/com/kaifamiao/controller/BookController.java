package com.kaifamiao.controller;

import com.kaifamiao.domain.Book;
import com.kaifamiao.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @ResponseBody
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

    @ResponseBody
    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

    @ResponseBody
    @RequestMapping(value = "/books", method = RequestMethod.PUT)
    public String update(@RequestBody Book book){
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

    @ResponseBody
    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

    @ResponseBody
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }


}
