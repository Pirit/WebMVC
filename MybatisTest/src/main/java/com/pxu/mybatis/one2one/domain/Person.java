package com.pxu.mybatis.one2one.domain;

public class Person {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Card card;

    public Person(Integer id, String name, String sex, Integer age, Card card) {

        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.card = card;
    }

    public Person() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", card=" + card +
                '}';
    }
}
