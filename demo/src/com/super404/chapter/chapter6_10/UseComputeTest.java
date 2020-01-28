package com.super404.chapter.chapter6_10;

public class UseComputeTest {

    public static void compute(ICompute compute, int num1, int num2){
        System.out.println(compute.computer(num1,num2));
    }

    public static void test(){
        ICompute compute = new AddOperator();
        System.out.println(compute instanceof AddOperator);
        System.out.println(compute instanceof ICompute);
        System.out.println("==============================");

        if (compute instanceof AddOperator){
            AddOperator addOperator = (AddOperator) compute;
            System.out.println(addOperator.computer(1,2));

            System.out.println(addOperator instanceof AddOperator);
            System.out.println(addOperator instanceof ICompute);
            System.out.println("==============================");

            AddOperator addOperator1 = new AddOperator();
            System.out.println(addOperator1 instanceof AddOperator);
            System.out.println(addOperator1 instanceof ICompute);

        }
    }

    public static void test1(){
        AddOperator addOperator = new AddOperator();
        System.out.println(addOperator instanceof AddOperator);
        System.out.println(addOperator instanceof AddAddOperator);
    }

    public static void main(String[] args) {

        compute(new AddOperator(),25,5);
        compute(new SubOperator(),25,5);
        compute(new MultiplyOperator(),25,5);
        compute(new DivideOperator(),25,0);
        
        //test();
        test1();

    }


}
