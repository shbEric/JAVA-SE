package com.super404.chapter7.chapter7_1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","cddd","xdddd","aaa");
        //List<String> resultList = list.stream().collect(Collectors.toList());
        //list.stream().collect(Collectors.toSet());
        List<String> resultList = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(resultList);

        List<String> results= list.stream().collect(Collectors.toCollection(CopyOnWriteArrayList::new));
        System.out.println(results);

        Set<String> treeSet = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
    }
}
