package com.super404.chapter2.chapter2_5;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(2);
        Optional<Student> optional1 = Optional.of(student1);

        Student student2 = null;
        Optional<Student> optional2 = Optional.ofNullable(student2);

        if (optional2.isPresent()){
            System.out.println("optional不为空");
            Student student = optional2.get();
        }else {
            System.out.println("optional为空");
        }

        Student student3 = Optional.ofNullable(student2).orElse(student1);
        System.out.println(student3.getAge());

        int result = Optional.ofNullable(student2).map(obj -> obj.getAge()).orElse(7);
        System.out.println(result);


    }
}
