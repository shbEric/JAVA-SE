package com.super404.chapter.chapter9_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OrderTest {
    public static void main(String[] args) {

        ArrayList<VideoOrder> videoOrders1 = new ArrayList<>();
        videoOrders1.add(new VideoOrder("a课程",22));
        videoOrders1.add(new VideoOrder("w课程", 200));
        videoOrders1.add(new VideoOrder("c课程", 100));
        videoOrders1.add(new VideoOrder("d课程", 33));
        videoOrders1.add(new VideoOrder("f课程", 1));

        ArrayList<VideoOrder> videoOrders2 = new ArrayList<>();
        videoOrders2.add(new VideoOrder("a课程", 22));
        videoOrders2.add(new VideoOrder("b课程", 18));
        videoOrders2.add(new VideoOrder("d课程", 33));
        videoOrders2.add(new VideoOrder("f课程", 1));
        videoOrders2.add(new VideoOrder("z课程", 22));


        //交集1
        videoOrders1.retainAll(videoOrders2);
        System.out.println(videoOrders1);

        //交集2
        /*List<VideoOrder> intersectionList = new ArrayList<>();
        for (VideoOrder videoOrder : videoOrders1){
            if (videoOrders2.contains(videoOrder)){
                intersectionList.add(videoOrder);
            }
        }
        System.out.println(intersectionList);*/

        //差集1
        //test2_1(videoOrders1, videoOrders2);

        //差集2
        //test2_2(videoOrders1, videoOrders2);

        //并集
        //test3(videoOrders1,videoOrders2);

        //去重并集
        //test4(videoOrders1, videoOrders2);

    }


    //差集1
    public static void test2_1(ArrayList<VideoOrder> videoOrders1, ArrayList<VideoOrder> videoOrders2){
        ArrayList<VideoOrder> videoOrders3 = (ArrayList<VideoOrder>) videoOrders1.clone();
        ArrayList<VideoOrder> videoOrders4 = (ArrayList<VideoOrder>) videoOrders2.clone();
        videoOrders4.removeAll(videoOrders3);
        System.out.println(videoOrders4);

        videoOrders1.removeAll(videoOrders2);
        System.out.println(videoOrders1);

        videoOrders1.addAll(videoOrders4);
        System.out.println(videoOrders1);
    }

    //差集2
    public static void test2_2(ArrayList<VideoOrder> videoOrders1, ArrayList<VideoOrder> videoOrders2){
        ArrayList<VideoOrder> videoOrders3 = (ArrayList<VideoOrder>) videoOrders1.clone();
        ArrayList<VideoOrder> videoOrders4 = (ArrayList<VideoOrder>) videoOrders2.clone();
        ArrayList<VideoOrder> differenceList2 = new ArrayList<>();
        for (VideoOrder videoOrder : videoOrders4){
            if (! videoOrders3.contains(videoOrder)){
                differenceList2.add(videoOrder);
            }
        }
        System.out.println(differenceList2);

        ArrayList<VideoOrder> differenceList1 = new ArrayList<>();
        for (VideoOrder videoOrder : videoOrders1){
            if (! videoOrders2.contains(videoOrder)){
                differenceList1.add(videoOrder);
            }
        }
        System.out.println(differenceList1);

        differenceList1.addAll(differenceList2);
        System.out.println(differenceList1);
    }

    //并集
    public static void test3(ArrayList<VideoOrder> videoOrders1, ArrayList<VideoOrder> videoOrders2){
        videoOrders1.addAll(videoOrders2);
        System.out.println(videoOrders1);
    }

    //去重并集
    public static void test4(ArrayList<VideoOrder> videoOrders1, ArrayList<VideoOrder> videoOrders2){
        videoOrders1.addAll(videoOrders2);
        Set<VideoOrder> set = new HashSet<>(videoOrders1);
        System.out.println(set);
    }

}

class VideoOrder{
    private int price;
    private String title;

    public VideoOrder(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return price == that.price &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, title);
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "price=" + price +
                ", title='" + title + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}