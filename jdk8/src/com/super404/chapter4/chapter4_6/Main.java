package com.super404.chapter4.chapter4_6;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //使⽤双冒号::来构造静态函数引⽤
        //System.out.println(Integer.parseInt("1234"));
        Function<String, Integer> fun = Integer::parseInt;
        Integer value = fun.apply("1234");
        System.out.println(value);

        // 使⽤双冒号::来构造⾮静态函数引⽤
        String content = "欢迎来到小d课堂学习";
        Function<Integer, String> func = content::substring;
        String result = func.apply(1);
        System.out.println(result);

        // 构造函数引⽤，多个参数
        BiFunction<Integer, String, User> biFunction = User::new;
        User user1 = biFunction.apply(10,"小d课堂");
        System.out.println(user1.toString());

        // 构造函数引⽤，单个参数
        Function<String, User> function = User::new;
        User user2 = function.apply("小d课堂");
        System.out.println(user2.toString());

        // 函数引⽤也是⼀种函数式接⼝，可以将函数引⽤作为⽅法的参数
        sayHello(String::toUpperCase, "xdclass.net");


    }

    private static void sayHello(Function<String, String> function, String param){
        String result = function.apply(param);
        System.out.println(result);
    }

}

class User{
    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
