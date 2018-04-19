package com.pxu.controller;

import com.pxu.domain.Book;
import com.pxu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @RequestMapping("/main")
    public String main(Model model){
        List<Book> bookList=bookService.findAll();
        model.addAttribute("book_list",bookList);
        return "main";
    }
}
