package com.super404.chapter4.chapter4_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("addd","xddd","asdfefgf","sdddd","acfgtht");
        List<String> results = filter(list, obj->obj.startsWith("a"));
        System.out.println(list);
        System.out.println(results);

    }

    public static List<String> filter(List<String> list, Predicate<String> predicate){
        List<String> results = new ArrayList<>();
        for (String str: list){
            if (predicate.test(str)){
                results.add(str);
            }
        }
        return results;
    }
}
