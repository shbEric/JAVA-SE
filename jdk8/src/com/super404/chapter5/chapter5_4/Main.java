package com.super404.chapter5.chapter5_4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("springboot", "springcloud", "redis", "git", "netty", "java", "html", "docker");
        boolean flag = list.stream().allMatch(obj->obj.length()>5);
        System.out.println(flag);

        boolean flag1 = list.stream().anyMatch(obj->obj.length()>5);
        System.out.println(flag1);
    }
}
