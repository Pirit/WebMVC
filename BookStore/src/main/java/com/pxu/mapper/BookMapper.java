package com.pxu.mapper;

import com.pxu.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    @Select("select * from tb_book")
    List<Book> findAll();
}
