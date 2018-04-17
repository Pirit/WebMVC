package com.pxu.mybatis.one2one.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String loginname;
    private String password;

    public User() {
        super();
    }

    public User(String username, String loginname, String password) {
        super();
        this.username = username;
        this.loginname = loginname;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
