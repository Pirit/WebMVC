package com.pxu.springmvc.controller;

import com.pxu.springmvc.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/json")
public class BookController {

    @RequestMapping("/testRequestBody")
    @ResponseBody
    public Object getJson(){
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1,"Spring MVC","Zoro"));
        list.add(new Book(2,"light JAVA Core","Mark"));
        return list;
    }
}
