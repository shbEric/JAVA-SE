package com.super404.chapter7.chapter7_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","cddd","xdddd","aaa");
        String result = String.join(",", list);
        System.out.println(result);

        String result1 = list.stream().collect(Collectors.joining());
        System.out.println(result1);

        String result2 = list.stream().collect(Collectors.joining("||"));
        System.out.println(result2);

        String result3 = list.stream().collect(Collectors.joining("||", "[","]"));
        System.out.println(result3);
    }
}
