package com.myself03.date.exer1;

import java.util.Date;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/17 15:18
 * 如何将一个java.util.Date的实例转换为java.sql.Date的实例
拓展：
将控制台获取的年月日（比如：2022-12-13）的字符串数据，保存在数据库中。
（简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13）。

 */
public class DataTransferTest {
    public static void main(String[] args) {
        Date date  =new Date();
        long time = date.getTime();
        java.sql.Date date1 = new java.sql.Date(time);
        System.out.println(date1);

    }
}
