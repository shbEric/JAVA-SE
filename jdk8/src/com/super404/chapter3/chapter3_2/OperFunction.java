package com.super404.chapter3.chapter3_2;

@FunctionalInterface
public interface OperFunction<R,T> {
    R operator(T t1, T t2);
    /*default void operator2(T t1, T t2){
    };*/
}
