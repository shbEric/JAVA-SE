package com.super404.chapter5.chapter5_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(new User(1,"⼩东","123"),
                                        new User(21,"jack","rawer"),
                                        new User(155,"tom","sadfsdfsdfsd"),
                                        new User(231,"marry","234324"),
                                        new User(100,"⼩ D","122223"));

        List<UserDTO> userDTOList = list.stream().map(obj->{
            UserDTO userDTO = new UserDTO(obj.getId(),obj.getName());
            return userDTO;
        }).collect(Collectors.toList());

        System.out.println(userDTOList);


        List<String> list1 = Arrays.asList("springboot", "springcloud", "redis", "git", "netty", "java", "html", "docker");
        List<String> resultList = list1.stream().filter(obj->obj.length()>5).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
