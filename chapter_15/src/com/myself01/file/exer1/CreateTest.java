package com.myself01.file.exer1;

import java.io.File;
import java.io.IOException;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/18 18:46
创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
 */
public class CreateTest {
    public static void main(String[] args) {
        File namedHello = new File("hello.txt");
        System.out.println(namedHello.getAbsoluteFile());
        System.out.println(namedHello.getAbsoluteFile().getParent());
        File file2 = new File(namedHello.getAbsoluteFile().getParent(),"abc.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
