package com.pxu.mybatis.one2one.controller;

import com.pxu.mybatis.one2one.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @RequestMapping("/main")
    public String main(Model model){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("java.jpg","疯狂JAVA讲义","Gang Li",74.2));
        bookList.add(new Book("ee.jpg","轻量级JAVAEE","Gang Li",59.2));
        bookList.add(new Book("android.jpg","Android 入门","Gang Li",55.3));
        bookList.add(new Book("ajax.jpg","Ajax细致讲解","Gang Li",33.9));

        model.addAttribute(bookList);
        return "main";
    }
}
