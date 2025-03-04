package com.myself01.string;

import org.junit.Test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/10 14:16
 */
public class StringMethodTest {
    //isEmpty   char是否length为0
    @Test
    public void test() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());


    }

    //equal  & equalIgnoreCase  \compare   compareIgnoreCase
    @Test
    public void test2() {
        String s1 = "heLlO";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3 = "猪";
        String s4 = "猪币";
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s4));


        String s5 = " 1 s df shame";
        System.out.println(s5.trim());
    }


}

