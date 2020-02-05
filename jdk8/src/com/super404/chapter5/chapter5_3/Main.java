package com.super404.chapter5.chapter5_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("springboot", "springcloud", "redis", "git", "netty", "java", "html", "docker");
        List<String> resultList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(resultList);

        //根据⻓度进⾏排序
        List<String> resultList1 = list.stream().sorted(Comparator.comparing(obj->obj.length())).collect(Collectors.toList());
        System.out.println(resultList1);
        List<String> resultList2 = list.stream().sorted(Comparator.comparing(obj->obj.length(),Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(resultList2);
        List<String> resultList3 = list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println(resultList3);

        //limit截取
        List<String> resultList4 = list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(resultList4);



    }
}
