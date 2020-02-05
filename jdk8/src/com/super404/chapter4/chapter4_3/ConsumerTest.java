package com.super404.chapter4.chapter4_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        sendMsg("123",obj -> {
            System.out.println(obj);
            System.out.println("调⽤短信接⼝发送短信，或者打印⽇志");
        });


        Consumer<String> consumer = obj -> {
            System.out.println(obj);
            System.out.println("调⽤短信接⼝发送短信，或者打印⽇志");
        };
        consumer.accept("1234567");

        sendMsg("8888",consumer);

        List<String> list = Arrays.asList("aaa","bbb");
        list.forEach(obj -> {
            System.out.println(obj);
        });

    }

    public static void sendMsg(String phone, Consumer<String> consumer){
        consumer.accept(phone);
    }
}
