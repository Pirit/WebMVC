package com.pxu.springmvc.controller;

import com.pxu.springmvc.entity.User2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController2 {

    @RequestMapping(value = "/registerForm2")
    public String registerForm(Model model) {
        User2 user = new User2("jack", "MAN", 20);
        model.addAttribute("command", user);
        return "registerForm2";
    }
}
