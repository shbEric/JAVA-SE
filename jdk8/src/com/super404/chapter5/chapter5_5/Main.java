package com.super404.chapter5.chapter5_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(32),new Student(33),
                new Student(21),new Student(29),new Student(18));
        //list.stream().max(Comparator.comparingInt(Student::getAge));
        Optional<Student> optionalStudent = list.stream().max((s1, s2)->{
            return Integer.compare(s1.getAge(),s2.getAge());
        });
        Student student = optionalStudent.get();
        System.out.println(student.getAge());

        Optional<Student> optionalStudent1 = list.stream().min((s1, s2)->{
            return Integer.compare(s1.getAge(),s2.getAge());
        });
        Student student1 = optionalStudent1.get();
        System.out.println(student1.getAge());




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