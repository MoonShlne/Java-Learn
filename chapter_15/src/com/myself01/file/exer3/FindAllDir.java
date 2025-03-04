package com.myself01.file.exer3;

import java.io.File;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/18 19:23
 * 遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
 * public void printFileName(File file)  //file可能是文件，也可能是文件目录
 */
public class FindAllDir {
    public static void isDirectory(File f) {
        if (f.isDirectory()) {
            System.out.println(f.getName());
            for (File s : f.listFiles()) {
                isDirectory(s);
            }
        } else {
            System.out.println(f.getName());
        }
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\polar\\Desktop\\老姚小课堂");
        isDirectory(file);

    }
}
