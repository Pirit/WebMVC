package com.pxu.mybatis.one2one.controller;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("msg", "Spring MVC -> Hello World!");
        model.addAttribute("name","Print Xu");
        return "hello";
    }
}
