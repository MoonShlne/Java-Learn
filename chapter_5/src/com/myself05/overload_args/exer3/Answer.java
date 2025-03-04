package com.myself05.overload_args.exer3;

import java.sql.SQLOutput;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/4 14:00
 * 附加题：（每题 10 分）
 * 1. public class Test {
 * int b=10;
 * method(a，b)；//需要在method方法被调用之后，仅打印出a=100，b=200，请写
 * 出method方法的代码
 * System.out.println("a="+a);
 * System.out.println("b="+b);
 * //代码编写处
 * }
 */
public class Answer {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
//        method(a, b);//需要在method方法被调用之后，仅打印出a=100，b=200，请写出method方法的代码
        System.out.println("a="+a);
        System.out.println("b="+b);
    }//代码编写处

}
