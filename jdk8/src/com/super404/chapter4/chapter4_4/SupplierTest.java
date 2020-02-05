package com.super404.chapter4.chapter4_4;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Student student = newStudent();
        System.out.println(student.getName());

    }

    public static Student newStudent(){
        Supplier<Student> supplier = ()->{
            Student student = new Student();
            student.setName("默认名称");
            return student;
        };
        //Supplier<Student> supplier = ()-> new Student();

        return supplier.get();
    }

}

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
