package com.super404.chapter2.chapter2_1;

public interface Animal {
    void eat();
    void run();

    default void breath(){
        System.out.println("使用氧气呼吸");
    }

    static void test(){
        System.out.println("这是静态方法");
    }
}
