package com.super404.chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //总价 35
        List<VideoOrder> videoOrders1 = Arrays.asList(
                new VideoOrder("20190242812", "springboot教程", 3),
                new VideoOrder("20194350812", "微服务SpringCloud", 5),
                new VideoOrder("20190814232", "Redis教程", 9),
                new VideoOrder("20190523812", "⽹⻚开发教程", 9),
                new VideoOrder("201932324", "百万并发实战Netty", 9));
        //总价 54
        List<VideoOrder> videoOrders2 = Arrays.asList(
                new VideoOrder("2019024285312", "springboot教程", 3),
                new VideoOrder("2019081453232", "Redis教程", 9),
                new VideoOrder("20190522338312", "⽹⻚开发教程", 9),
                new VideoOrder("2019435230812", "Jmeter压⼒测试", 5),
                new VideoOrder("2019323542411", "Git+Jenkins持续集成", 7),
                new VideoOrder("2019323542424", "Idea全套教程", 21));

        //交集
        List<VideoOrder> intersectionList = videoOrders1.stream().filter(videoOrders2::contains).collect(Collectors.toList());
        System.out.println(intersectionList);

        //差集1
        List<VideoOrder> diffList1 = videoOrders1.stream().filter(obj-> !videoOrders2.contains(obj)).collect(Collectors.toList());
        System.out.println(diffList1);

        //差集2
        List<VideoOrder> diffList2 = videoOrders2.stream().filter(obj-> !videoOrders1.contains(obj)).collect(Collectors.toList());
        System.out.println(diffList2);

        //差集总
        List<VideoOrder> diffAllList = new ArrayList<>();
        diffAllList.addAll(diffList1);
        diffAllList.addAll(diffList2);
        System.out.println(diffAllList);

        //并集
        List<VideoOrder> allvideoOrder = videoOrders1.parallelStream().collect(Collectors.toList());
        allvideoOrder.addAll(videoOrders2);
        System.out.println(allvideoOrder);

        //去重并集
        List<VideoOrder> allvideoOrderDistinct = allvideoOrder.parallelStream().distinct().collect(Collectors.toList());
        System.out.println(allvideoOrderDistinct);

        //平均价格1
        double videoOrderAvg1 = videoOrders1.stream().collect(Collectors.averagingInt(VideoOrder::getMoney)).doubleValue();
        System.out.println(videoOrderAvg1);
        //平均价格2
        double videoOrderAvg2 = videoOrders2.stream().collect(Collectors.averagingInt(VideoOrder::getMoney)).doubleValue();
        System.out.println(videoOrderAvg2);

        //总价1
        int videoOrderSum1 = videoOrders1.stream().collect(Collectors.summingInt(VideoOrder::getMoney)).intValue();
        System.out.println(videoOrderSum1);

        //总价1
        int videoOrderSum2 = videoOrders2.stream().collect(Collectors.summingInt(VideoOrder::getMoney)).intValue();
        System.out.println(videoOrderSum2);


    }


}
