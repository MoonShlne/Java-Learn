package com.myself03.buffered;

import com.sun.tools.javac.Main;
import org.junit.Test;

import java.io.*;
import java.sql.SQLOutput;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/20 14:14
 */
public class BufferStreamTest {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        test1("test.jpg","copy.jpg"); //29
//        test1("test.jpg","copy.jpg"); //1575
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

    }

    public static void test1(String s1,String s2) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File source = new File(s1);
            File sink = new File(s2);

            fis = new FileInputStream(source);
            fos = new FileOutputStream(sink);

            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[50];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void test2(String s1,String s2) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File source = new File(s1);
            File sink = new File(s2);

            fis = new FileInputStream(source);
            fos = new FileOutputStream(sink);

            byte[] bytes = new byte[50];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
