package com.myself03.date.exer2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/20 13:17
 * 案例：百天推算
 *
 * 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 *
 * 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 */
public class DataTest {
    @Test
    public void test(){
        Calendar calendar =Calendar.getInstance();
        calendar.set(2003,07,03);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,100);
        System.out.println(calendar.getTime());
    }
    @Test
    public void test1(){
        LocalDateTime myData = LocalDateTime.now();
        System.out.println(myData);
        LocalDateTime futureData = myData.plusDays(100);
        System.out.println(futureData);

    }
}
