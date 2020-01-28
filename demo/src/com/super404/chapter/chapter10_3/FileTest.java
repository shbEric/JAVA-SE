package com.super404.chapter.chapter10_3;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\Eric\\Desktop";
        createFile(path);
    }

    public static void createFile(String path){
        String root = path + File.separator + "test";
        File rootDir = new File(root);
        if (!rootDir.exists()){
            rootDir.mkdirs();
        }

        for (int i =1; i<=10; i++){
            String dirPath = root + File.separator + i;
            File dirFile = new File(dirPath);
            if (!dirFile.exists()){
                dirFile.mkdir();

                String textPath = dirPath + File.separator + i + ".txt";
                File txtFile = new File(textPath);
                if (!txtFile.exists()){
                    try {
                        txtFile.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
