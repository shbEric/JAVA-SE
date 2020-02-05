package com.super404.chapter3.chapter3_2;

public class Main {
    public static void main(String[] args) {

        System.out.println(operator(20,5,(x,y)->x*y));
        System.out.println(operator(20,5,(Integer x, Integer y)->{return x*y;}));

        System.out.println(operator(20,5,(x,y)->x+y));
        System.out.println(operator(20,5,(x,y)->x-y));
        System.out.println(operator(20,5,(x,y)->x/y));

    }

    public static Integer operator(Integer x, Integer y, OperFunction<Integer, Integer> of){
        return of.operator(x,y);
    }
}
