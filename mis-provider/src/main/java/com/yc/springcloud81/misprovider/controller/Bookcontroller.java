package com.yc.springcloud81.misprovider.controller;


import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class Bookcontroller {

    //注入service
    @Autowired
    private BookService bookservice;

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") Integer id){

        return bookservice.getBook(id);
    }

}
