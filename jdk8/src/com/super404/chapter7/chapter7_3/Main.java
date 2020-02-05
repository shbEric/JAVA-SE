package com.super404.chapter7.chapter7_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "springboot", "HTML5","nodejs","CSS3");
        Map<Boolean, List<String>> result = list.stream().collect(Collectors.partitioningBy(obj->obj.length()>4));
        System.out.println(result);
    }
}
