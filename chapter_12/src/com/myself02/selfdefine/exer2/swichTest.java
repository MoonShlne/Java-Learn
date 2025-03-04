package com.myself02.selfdefine.exer2;

import java.util.Arrays;

import static com.myself02.selfdefine.exer2.switchMethodTest.method1;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/4 0:44
 */
public class swichTest {
    public static void main(String[] args) {
        String s[] = new String[]{"aa","bb","cc"};
        method1(s,0,2);
        System.out.println(Arrays.toString(s));
    }
}
