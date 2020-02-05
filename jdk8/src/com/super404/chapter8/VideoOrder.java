package com.super404.chapter8;

import java.util.Objects;

public class VideoOrder {

    private String tradeNo;
    private int money;
    private String title;

    public VideoOrder() {
    }

    public VideoOrder(String tradeNo, String title, int money) {
        this.tradeNo = tradeNo;
        this.money = money;
        this.title = title;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
