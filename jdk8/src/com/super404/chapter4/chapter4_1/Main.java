package com.super404.chapter4.chapter4_1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        test("测试  ", new FunctionObj());

        /*Function<Integer, Integer> function = p -> {
            System.out.println("我是函数");
            return p*100;
        };*/

        Function<Integer, Integer> function = p->p*100;

        System.out.println(function.apply(10));


    }

    public static void test(String input, Function function){
        System.out.println(function.apply(input));
    }


}
