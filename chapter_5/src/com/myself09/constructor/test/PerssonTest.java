package com.myself09.constructor.test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/6 15:15
 */
public class PerssonTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.Person(1);
        Person p2 =new Person(2);
        System.out.println(p2.a);
    }
}
