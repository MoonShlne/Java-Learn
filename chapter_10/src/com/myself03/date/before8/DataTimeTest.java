package com.myself03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author polar
 * @version 1.0
 * @since 2024/12/17 13:44
 */
public class DataTimeTest {
    @Test
    public void test(){
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());

        Date date1 = new Date(1734411441271L);
        System.out.println(date1);
    }


    @Test
    public void test1(){
        java.sql.Date date = new java.sql.Date(1734414441271L);
        System.out.println(date);
    }


    @Test
    public void test2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        Date parse = simpleDateFormat.parse("2024/12/17 下午2:13");
        System.out.println(parse);
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println(simpleDateFormat.parse("2024 12 17"));

    }
    @Test
    public void test5(){
        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));


        instance.set(Calendar.DAY_OF_MONTH,4);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

    }


}
