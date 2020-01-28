package com.super404.chapter.chapter6_10;

public class UseComputeTest1 {

    public static void compute(ICompute1 compute, int num1, int num2){
        System.out.println(compute.compute(num1,num2));
    }

    public static void test(){
        ICompute1 compute = new AddOperator1();
        System.out.println(compute.compute(1,2));
        //compute目前是父类对象，用不了子类中新增的方法
        System.out.println(compute instanceof AddOperator1);
        System.out.println(compute instanceof ICompute1);
        System.out.println("==============================");

        if (compute instanceof AddOperator1){
            AddOperator1 addOperator = (AddOperator1) compute;
            System.out.println(addOperator.compute(1,2));
            addOperator.compute1();

            System.out.println(addOperator instanceof AddOperator1);
            System.out.println(addOperator instanceof ICompute1);
            System.out.println("==============================");

            AddOperator1 addOperator1 = new AddOperator1();
            System.out.println(addOperator1 instanceof AddOperator1);
            System.out.println(addOperator1 instanceof ICompute1);

        }
    }

    public static void test1(){
        AddOperator1 addOperator = new AddOperator1();
        System.out.println(addOperator instanceof AddOperator1);
        //System.out.println(addOperator instanceof AddAddOperator);
    }

    public static void main(String[] args) {

        compute(new AddOperator1(),25,5);
        compute(new SubOperator1(),25,5);
//        compute(new MultiplyOperator(),25,5);
//        compute(new DivideOperator(),25,0);

        test();
        //test1();

    }


}
