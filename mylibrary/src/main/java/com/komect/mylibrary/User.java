package com.komect.mylibrary;

import org.litepal.crud.DataSupport;

/**
 * Created by lsl on 2017/9/26.
 */
public class User extends DataSupport {

    private String name;
    private int age;


    public User() {}


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

}
