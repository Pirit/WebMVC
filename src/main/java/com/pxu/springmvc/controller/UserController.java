package com.pxu.springmvc.controller;

import com.pxu.springmvc.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static List<User> userList;

    private String loginView = "loginForm";
    private String registerView = "registerForm";
    private String welcomeView = "welcome";

    public UserController() {
        super();
        userList = new ArrayList<User>();
    }

    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        logger.info("register GET method invoked...");
        return registerView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(
            @RequestParam("loginname")
                    String loginname,
            @RequestParam("password")
                    String paswword,
            @RequestParam("username")
                    String username
    ) {
        logger.info("register POST invoked...");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(paswword);
        user.setUsername(username);
        userList.add(user);
        return loginView;
    }

    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("loginname")
                    String loginname,
            @RequestParam("password")
                    String password, Model model
    ) {
        logger.info("Account: " + loginname + " ( Password: " + password + " )");
        for (User user : userList) {
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
                model.addAttribute("user", user);
                return welcomeView;
            }
        }
        return loginView;
    }
}
