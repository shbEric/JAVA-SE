package com.super404.chapter.chapter5_7;

public class Dog {
    public static int age = 10;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Dog.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeAge(){
        age ++;
    }
}
