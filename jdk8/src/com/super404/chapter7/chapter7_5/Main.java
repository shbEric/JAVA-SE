package com.super404.chapter7.chapter7_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("⼴东", 23),
                new Student("⼴东", 24), new Student("⼴东", 23),
                new Student("北京", 22), new Student("北京", 20),
                new Student("北京", 20),new Student("海南", 25));

        Map<String, Long> listMap = students.stream().collect(Collectors.groupingBy(obj->obj.getProvince(), Collectors.counting()));
        listMap.forEach((key,value)->{
            System.out.println(key+"有"+value+"名");
        });

    }
}

class Student{
    private String province;
    private int age;

    public Student() {
    }

    public Student(String province, int age) {
        this.province = province;
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "province='" + province + '\'' +
                ", age=" + age +
                '}';
    }
}
