package com.super404.chapter6.chapter6_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //list.stream().forEach(System.out::println);
        list.parallelStream().forEach(System.out::println);


        for (int i = 0; i < 10; i++) {
            //List<Integer> list1 = new ArrayList<>();
            List<Integer> list1 = new CopyOnWriteArrayList<>();
            IntStream.range(0,100).parallel().forEach(list1::add);
            System.out.println(list1.size());
        }


    }
}
