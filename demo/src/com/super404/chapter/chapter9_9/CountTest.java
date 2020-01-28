package com.super404.chapter.chapter9_9;

import java.util.HashMap;
import java.util.Set;

public class CountTest {
    public static void main(String[] args) {
        String string = "*Constructs a new <tt>HashMap</tt> ⼩滴课堂 with the same mappings as the * " +
                "⼩滴课堂 specified <tt>Map</tt>. The <tt>HashMap</tt> is created with default " +
                "load factor (0.75) and an initial capacity sufficient to*hold the mappings " +
                "in the specified <tt>Map</tt>.";

        //把字符串转为数组
        char [] charArray = string.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        //遍历数组
        for (int i = 0; i<charArray.length ;i++){
            Integer counts = map.get(charArray[i]);
            if (counts == null){
                map.put(charArray[i],1);
            }else {
                counts++;
                map.put(charArray[i],counts);
            }
        }

        //遍历方法一
        Set<HashMap.Entry<Character, Integer>> entrySet =  map.entrySet();
        for (HashMap.Entry<Character, Integer> entry : entrySet){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //遍历方法二
        /*Set<HashMap.Entry<Character, Integer>> entrySet =  map.entrySet();
        Iterator<HashMap.Entry<Character, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            HashMap.Entry<Character, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*/

    }
}
