package com.myself01.file;

import java.io.File;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/17 20:26
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\polar\\OneDrive - frtouch\\乐谱\\从零起步基础教学\\2");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.exists());



    }

}
