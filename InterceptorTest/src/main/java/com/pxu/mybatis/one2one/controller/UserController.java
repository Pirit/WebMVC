package com.pxu.mybatis.one2one.controller;

import com.pxu.mybatis.one2one.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @RequestMapping("/login")
    public ModelAndView login(String loginname, String password, ModelAndView mv, HttpSession session) {
        if (loginname!=null && password !=null
                && loginname.equals("pxu") && password.equals("123123")){
            User user = new User();
            user.setLoginname(loginname);
            user.setPassword(password);
            user.setUsername("Admin");

            session.setAttribute("user",user);

            mv.setViewName("redirect:main");
        }else {
            mv.addObject("message","Login Failed with wrong account!");
            mv.setViewName("loginForm");
        }
    return mv;
    }
}
