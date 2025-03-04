package com.myself01.file.exer3;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * @author polar
 * @version 1.0
 * @since 2025/2/18 19:23
 * 拓展2：计算指定文件目录占用空间的大小
 * public long getDirectorySize(File file)  //file可能是文件，也可能是文件目录
 */


public class DelAllDir {
    public static void deleteAll(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files){
                deleteAll(f);
            }
        }
        System.out.println(file.delete()?"删除成功"+file.getAbsoluteFile()+"文件名："+file.getName():"删除失败");
    }

    public static void main(String[] args) {
        File root = new File("C:\\Users\\polar\\Desktop\\老姚小课堂");
        deleteAll(root);
    }
}
