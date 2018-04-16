package com.pxu.springmvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.pxu.springmvc.entity.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/json")
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping("/testRequestBody")
    public void setJson(
            @RequestBody
                    Book book, HttpServletResponse response) throws IOException {
        logger.info(JSONObject.toJSONString(book));
        book.setAuthor("Pirit Xu");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(JSONObject.toJSONString(book));
    }
}
