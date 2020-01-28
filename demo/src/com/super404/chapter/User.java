package com.super404.chapter;

/**
 * 定义了一个User类
 * @author Eric
 * @version 1.0.0
 */
public class User {

    public static void sleep(){
        System.out.println("我要睡觉了");
        System.out.println("我要睡觉了1");
        System.out.println("我要睡觉了2");
        System.out.println("我要睡觉了3");
        System.out.println("我要睡觉了4");
    }


    public static void main(String [] args){
        User user = new User();
        user.sleep();
    }
}
