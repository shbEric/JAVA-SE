package com.super404.chapter2.chapter2_1;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog 吃饭");
    }

    @Override
    public void run() {
        System.out.println("Dog 奔跑");
    }

}
