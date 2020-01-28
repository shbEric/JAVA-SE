package com.super404.chapter.chapter5_7;

import java.util.Arrays;

public class AnswerTest {
    public static void main(String[] args) {

        //test1();
        //test2();
        test3();

    }

    public static void test1(){
        Student [] studentArr1 = new Student[60];
        int studentArr1Index = 0;
        Student [] studentArr2 = new Student[40];
        int studentArr2Index = 0;

        for (int i=0; i<100; i++){

            Student student = new Student();
            student.setId(i+1);
            if (i+1 > 60){
                studentArr2[studentArr2Index] = student;
                studentArr2Index++;
            }else {
                studentArr1[studentArr1Index] = student;
                studentArr1Index++;
            }
        }

        System.out.println(Arrays.toString(studentArr1));
        System.out.println(Arrays.toString(studentArr2));

        for (Student student: studentArr1){
            System.out.println("分组一的id"+student.getId());
        }

        System.out.println("========================");

        for (Student student: studentArr2){
            System.out.println("分组二的id"+student.getId());
        }
    }

    public static void test2(){
        int i = 10;
        String festival = "";

        switch (i){
            case 1 : festival = "春天";
                break;
            case 2 : festival = "夏天";
                break;
            case 3 : festival = "秋天";
                break;
            case 4 : festival = "冬天";
                break;
            default: {
                festival = "错误季节";
                System.out.println("default执行");
            }
                break;
        }

        System.out.println(festival);
    }

    public static void test3(){
        Dog [] dogs = new Dog[5];

        for (int i=0; i<5; i++){
            Dog dog = new Dog();
            dog.setName("旺财"+i);
            dogs[i] = dog;
        }

        dogs[3].changeAge();
        dogs[3].changeAge();

        for(Dog dog : dogs){
            System.out.println(dog.getName() + "年龄为" +dog.getAge());
        }
    }
}
