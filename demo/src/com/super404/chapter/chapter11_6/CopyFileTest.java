package com.super404.chapter.chapter11_6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileTest {
    public static void main(String[] args) {

        String dir = "C:\\Users\\Eric\\Desktop";
        File fileFolder = new File(dir+File.separator+"test");
        File[] files = fileFolder.listFiles();
        for (File from : files){
            //System.out.println(from.getAbsolutePath());
            //System.out.println(from.getParent());
            copyFileFolder(from.getAbsolutePath(), dir+File.separator+"test1"+File.separator+from.getName());
        }
    }

    public static void copyFileFolder(String from, String to){
        File targetDir = new File(new File(to).getParent());
        if (!targetDir.exists()){
            targetDir.mkdirs();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(from);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(to);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int size;
            byte[] buf = new byte[1024];

            while((size = bufferedInputStream.read(buf)) != -1){
                bufferedOutputStream.write(buf,0,size);
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
