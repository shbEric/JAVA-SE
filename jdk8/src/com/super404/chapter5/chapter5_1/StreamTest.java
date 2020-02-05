package com.super404.chapter5.chapter5_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("springboot教程","微服务教程","并发编程","压⼒测试","架构课程");

        List<String> resultList = list.stream().map(obj->"在小d课堂学习"+obj).collect(Collectors.toList());

        System.out.println(resultList);
    }
}
