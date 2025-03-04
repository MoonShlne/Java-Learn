package com.myself01.file.exer3;

import java.io.File;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/18 19:23
 *拓展2：计算指定文件目录占用空间的大小
 * public long getDirectorySize(File file)  //file可能是文件，也可能是文件目录
 */
public class SumByteAllDir {
    public static long isDirectory(File f) {
        long data = 0L;
        if (f.isDirectory()) {
            for (String s : f.list()) {
                File file = new File(f, s);
                data+=isDirectory(file);
            }
        } else {
            data+=f.length();
        }
        return  data;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\polar\\Desktop\\老姚小课堂");
        System.out.println(isDirectory(file));

    }
}
