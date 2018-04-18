package com.pxu.mybatis.many2many.mapper;

import com.pxu.mybatis.many2many.domain.Article;

public interface ArticleMapper {

    Article selectArticleByOrderId(int id);
}
