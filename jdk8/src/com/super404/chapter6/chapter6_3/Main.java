package com.super404.chapter6.chapter6_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","cddd","xdddd");
        list.forEach(obj-> System.out.println(obj));
        list.forEach(System.out::println);

        List<Student> studentList = Arrays.asList(new Student(2),new Student(21),
                new Student(32),new Student(1));
        studentList.forEach(student -> {
            System.out.println(student.getAge());
            if (student.getAge()==21){
                System.out.println("进入if判断");
                return;
                //break;
            }
        });

    }
}

class Student{
    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
