package com.super404.chapter2.chapter2_2;

import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) throws Exception {

        //老方法
        /*BASE64Encoder encoder = new BASE64Encoder();
        BASE64Decoder decoder = new BASE64Decoder();

        String text = "测试课堂";

        byte[] textBytes = text.getBytes("UTF-8");

        //编码
        String encodedText = encoder.encode(textBytes);
        System.out.println(encodedText);

        //解码
        System.out.println(new String(decoder.decodeBuffer(encodedText), "UTF-8"));*/


        //新方法
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();

        String text = "测试课堂";
        byte[] textBytes = text.getBytes("UTF-8");

        //编码
        String encodedText = encoder.encodeToString(textBytes);
        System.out.println(encodedText);

        //解码
        System.out.println(new String(decoder.decode(encodedText), "UTF-8"));

    }
}
