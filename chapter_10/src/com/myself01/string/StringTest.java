package com.myself01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/9 14:14
 */
public class StringTest {

    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2.replace("l", "w");
        String s4 = "hewwo";
//        System.out.println(s1 == s2);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s4 == s3);

    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + "world";
        String s5 = "hello" + s2;
        String s6 = s1 + s2;
        String s7 = "hello" + "world";
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);

        System.out.println(s3 == s7);
    }

    @Test
    public void test3() {
        String s1 = "123";

        int i = Integer.parseInt(s1);

        String s2 = i + "";
        System.out.println(s1 == s2);
    }

    @Test
    public void test4() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s3);
        char[] charArray = s3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);

        }

    }

    //编码
    @Test
    public void test5() throws UnsupportedEncodingException {
        String str = new String("pig猪");
//       char[] charArray = str.toCharArray();
        //GBK
        byte[] bytes_gbk = str.getBytes("gbk");
        for (int i = 0; i < bytes_gbk.length; i++) {
            System.out.println(bytes_gbk[i]);
        }
        System.out.println("---------------");
        //utf8
        byte[] bytes_utf = str.getBytes("utf8");
        for (int i = 0; i < bytes_utf.length; i++) {
            System.out.println(bytes_utf[i]);
        }
        //byte --> string   gbk
        String str_gbk = new String(bytes_gbk, "gbk");
        System.out.println(str_gbk);
        //utf
        String str_utf = new String(bytes_utf, "utf8");
        System.out.println(str_utf);

        System.out.println("分割线---------------------");
        //手持锟斤拷，口呼烫烫烫
        String str_plus = new String(bytes_gbk, "utf8");   //故意使用错误编码编译出现��
        System.out.println(str_plus);
        byte[] bytes = str_plus.getBytes();
        //当连续两个“�”“�”字符放一起时：'0xEF 0xBF 0xBD’，‘0xEF 0xBF 0xBD'。
        //一旦将这个UTF-8字符转换为GBK码(两个字节)，便是：‘0xEF 0xBF ’，‘0xBD 0xEF’，‘0xBF 0xBD’
        //其对应的GBK字符便是：锟（0xEFBF），斤（0xBDEF），拷（0xBFBD）
        String str666 = new String(bytes, "gbk");
        System.out.println(str666);


    }
}
