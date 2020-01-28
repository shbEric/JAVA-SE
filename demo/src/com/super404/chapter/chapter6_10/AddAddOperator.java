package com.super404.chapter.chapter6_10;

public class AddAddOperator extends AddOperator {
    @Override
    public int computer(int num1, int num2) {
        return super.computer(num1++, num2++);
    }
}
