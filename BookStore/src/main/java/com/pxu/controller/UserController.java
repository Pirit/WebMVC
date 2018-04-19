package com.pxu.controller;

import com.pxu.domain.User;
import com.pxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(
            @RequestParam("loginname")
                    String loginname,
            @RequestParam("password")
            String password, ModelAndView mv, HttpSession session) {
        User user = userService.login(loginname, password);
        if (user != null) {
            session.setAttribute("user", user);
            mv.setView(new RedirectView("/BookStore/main"));
        } else {
            mv.addObject("msg", "Login Failed. Check your account!");
            mv.setViewName("loginForm");
        }
        return mv;
    }
}
