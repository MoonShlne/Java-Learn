package com.myself01.file.exer2;

import org.hamcrest.core.Is;

import java.io.File;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/18 19:23
 * 遍历文件夹，递归查询
 */
public class PrintJpgPlus {
    public static void  isDirectory(File f){
        if (f.isDirectory()){
            for (String s : f.list()){
                File file = new File(f, s);
                isDirectory(file);
            }
        }
        else {
//            System.out.println(f.getName());
            if (f.getName().endsWith("jpg")){
                System.out.println(f.getName());
                System.out.println(f.getAbsoluteFile());
            }
        }


    }
    public static void main(String[] args) {
        File file = new File("C:\\Users\\polar\\Pictures");
        isDirectory(file);

    }
}
