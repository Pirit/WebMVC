package com.pxu.springmvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/DataBinding")
public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    @RequestMapping("/DataBinding")
    public String dataBindingHome(){
        return "/index.jsp";
    }

    @RequestMapping("/pathVariableTest/{userId}")
    public void pathVariableTest(
            @PathVariable
                    Integer userId
    ) {
        logger.info("value of @PathVariable: " + userId);
    }

    @RequestMapping("/requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent")
                    String userAgent,
            @RequestHeader(value = "Accept")
                    String[] accepts
    ) {
        logger.info("value of @RequestHeader: " + userAgent);
        for (String accept : accepts) {
            logger.info(accept);
        }
    }

    @RequestMapping("/cookieValueTest")
    public void cookieValueTest(
            @CookieValue(value = "JSESSIONID", defaultValue = "")
                    String sessionId
    ) {
        logger.info("value of @RequestHeaderTest: " + sessionId);
    }
}
