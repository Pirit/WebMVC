package com.pxu.service.impl;

import com.pxu.domain.Book;
import com.pxu.mapper.BookMapper;
import com.pxu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
