package com.myself02.filestream;

import org.junit.Test;

import java.io.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/19 20:04
 */
public class FileInoutputStreamTest {
    @Test
    public void test()  {
        File oranFile = new File("test.jpg");
        File toFile = new File("copy_img.jpg");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {

            fileInputStream = new FileInputStream(oranFile);
            fileOutputStream = new FileOutputStream(toFile,true);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) {

                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
