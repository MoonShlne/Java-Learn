package com.myself01.oop;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/21 19:53
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone xiaomi =new Phone();
        xiaomi.grand="小米18~";
        xiaomi.price=16999.9;

        System.out.println(xiaomi.price);
        xiaomi.call();

        xiaomi.massage("有内鬼 ");

    }
}
