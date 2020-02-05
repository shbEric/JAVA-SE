package com.super404.chapter6.chapter6_2;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int value = Stream.of(1,2,3,4,5).reduce((item1,item2)->item1+item2).get();
        System.out.println(value);

        int value1 = Stream.of(1,2,3,4,5).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        }).get();
        System.out.println(value1);

        int value2 = Stream.of(1,2,3,4,5).reduce(100,(item1,item2)->item1+item2);
        System.out.println(value2);

        int value3 = Stream.of(1,2,3,4,5).reduce(BinaryOperator.minBy(Comparator.naturalOrder())).get();
        System.out.println(value3);

        int value4 = Stream.of(1645, 234345, 32, 44434,564534,435,34343542,212)
                .reduce((item1,item2)->item1>item2?item1:item2).get();
        System.out.println(value4);

    }
}
