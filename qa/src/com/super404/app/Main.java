package com.super404.app;

import com.super404.model.Response;
import com.super404.service.QkyRobotServiceImpl;
import com.super404.service.RobotService;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class Main {

    private static final RobotService robotService = new QkyRobotServiceImpl();

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("⽼板,麻烦您给我取个响亮的名字吧,按回⻋键确定!!!");

        String name = scanner.nextLine();
        System.out.println("Hi,我是您的⼩助⼿ " + name + ",直接对我下达指令");

        while (true){
            String input = scanner.nextLine();
            if ("886".equalsIgnoreCase(input)){
                System.out.println("欢迎下次使⽤,拜拜");
                break;
            } else {
                Response response = robotService.qa(input);
                if (response != null &&response.getCode() == 0){
                    System.out.println(name + ":" + new String(response.getContent().getBytes(),"UTF-8"));
                } else {
                    System.out.println(name +  " 暂时没明⽩您的意思,重新告诉我下吧!");

                }
            }
        }

        scanner.close();
    }

}
