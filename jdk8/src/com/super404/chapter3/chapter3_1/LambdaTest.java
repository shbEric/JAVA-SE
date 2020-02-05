package com.super404.chapter3.chapter3_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {

        test();
        //test1();
    }

    public static void test(){
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("学习");
            }
        }).start();*/

        new Thread(() -> System.out.println("学习一")).start();
        new Thread(() -> {
            System.out.println("学习一");
            System.out.println("学习二");
        }).start();
    }


    public static void test1(){
        List<String> list = Arrays.asList("aaa","ggg","ffff","ccc");
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/
        Collections.sort(list, (a,b)->b.compareTo(a));
        Collections.sort(list, (a,b)->{
            return b.compareTo(a);
        });
        System.out.println(list.toString());
    }

}
