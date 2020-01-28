package com.super404.chapter.chapter6_10;

public class AddOperator1 extends ICompute1 {

    @Override
    public int compute(int num1, int num2) {
        return num1+num2;
    }

    public void compute1(){
        System.out.println("非父类方法");
    }
}
