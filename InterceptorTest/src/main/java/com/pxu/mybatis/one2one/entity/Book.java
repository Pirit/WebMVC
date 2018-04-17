package com.pxu.mybatis.one2one.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private String icon;
    private String name;
    private String author;
    private double price;

    public Book() {
        super();
    }

    public Book(String icon, String name, String author, double price) {
        super();
        this.icon = icon;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
