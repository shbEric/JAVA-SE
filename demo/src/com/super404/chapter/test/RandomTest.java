package com.super404.chapter.test;

import java.util.Random;

/**
 * 这个是作业一
 * @author Eric
 * @version 1.0.0
 */
public class RandomTest {

    /**
     * 这是主方法入口
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("今天这个是我的第⼀个程序");
        System.out.println("⼩滴课堂java基础教程");

        //随即⽣成true或者false
        Random random = new Random();
        boolean flag = random.nextBoolean();
        System.out.println(flag);
    }
}
