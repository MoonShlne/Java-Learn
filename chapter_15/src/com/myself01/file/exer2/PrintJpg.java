package com.myself01.file.exer2;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/18 18:54
 * 练习：
 * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称

 * 提示：File类提供了文件过滤器方法(拓展)
 * public String[] list(FilenameFilter filter)
 */
public class PrintJpg {
    public static void main(String[] args) {
        File screen = new File("C:\\Users\\polar\\Pictures\\Screenshots");
//        System.out.println(Arrays.toString(screen.list()));
        String[] list = screen.list();
        for (String b :list){
           System.out.println(b);
           if (b.endsWith("jpg")){
               System.out.println(b);
           }
       }
    }
}
