package com.myself03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/19 15:23
 */
public class DataTimeTest {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,22);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

    }

    @Test
    public void test(){
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    @Test
    public void test2(){
        LocalDateTime now = LocalDateTime.now();   //不可变
        System.out.println(now);
        LocalDateTime now1 = now.withDayOfMonth(1);
        System.out.println(now);
        System.out.println(now1);

    }

    @Test
    public void test3(){
        Instant instant = Instant.now();
        System.out.println(instant);
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);


        Instant instant1 = Instant.ofEpochMilli(232114544331L);
        System.out.println(instant1);


        System.out.println(instant1.toEpochMilli());


    }

    @Test
    public void test4(){
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("YYYY MM DD HH");
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);
        System.out.println(dateTimeFormatter.parse("2024 12 355 13"));
    }
}
