package com.super404.chapter.chapter4_6;

public class HeapStackTest {
    public static void main(String[] args) {
        String a = "⼩D课堂学习java架构课程";
        String b = "l love java";
        System.out.println(a);
        System.out.println(b);
        b = a ;
        System.out.println(a);
        System.out.println(b);
        a = "⼩D课堂学习java架构课程，现在在学java基础";
        System.out.println(a);
        System.out.println(b);

        /*int [] a = {1,2,3};
        int [] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        b[0] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));*/

    }
}
