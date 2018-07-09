package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by ASUS on 2018/7/9.
 */
@Component
public class User implements Serializable{
    private int value;
    private String name;

    public User(String name,int value ) {
        this.value = value;
        this.name = name;
    }

    public User() {
  }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
