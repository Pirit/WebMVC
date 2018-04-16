package com.pxu.springmvc.controller;

import com.pxu.springmvc.entity.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/json")
public class BookController {
    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping(value = "/testRequestBody", method = RequestMethod.POST)
    public void setJson(
//    public @ResponseBody Book setJson(
            @RequestBody
                    Book book, HttpServletResponse response) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        logger.info(mapper.writeValueAsString(book));
        book.setAuthor("Zoro Ju");
        logger.info(mapper.writeValueAsString(book));
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));

//        return book;
    }

}
