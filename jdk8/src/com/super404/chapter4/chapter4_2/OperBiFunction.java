package com.super404.chapter4.chapter4_2;

import java.util.function.BiFunction;

public class OperBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a+b;
        System.out.println(biFunction.apply(1,2));

        System.out.println(operator(3,5,(a,b)->a+b));
        System.out.println(operator(3,5,(a,b)->a-b));
        System.out.println(operator(3,5,(a,b)->a*b));
        System.out.println(operator(3,5,(a,b)->a/b));
    }

    public static Integer operator(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a,b);
    }
}
