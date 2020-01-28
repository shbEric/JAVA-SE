package com.super404.chapter.chapter6_10;

public class DivideOperator implements ICompute {
    @Override
    public int computer(int num1, int num2) {
        /*if (num2 == 0){
            return -1;
        }else{
            return num1/num2;
        }*/

        try {
            return num1/num2;
        }catch (Exception e){
            e.printStackTrace();
        }

        return -1;

    }
}
