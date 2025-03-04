package com.myself05.other;

import org.junit.Test;

import java.util.Random;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/15 21:35
 */
public class OtherApiTest {

    @Test
    public void test() {
        String aa = System.getProperty("java.version");
        System.out.println(aa);
    }

    @Test
    public void test2() {
        String java_home = System.getProperty("java.home");
        System.out.println(java_home);
    }

    @Test
    public void test3() {
        String name = System.getProperty("os.name");
        System.out.println(name);
    }

    @Test
    public void test4(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(0,31);
            System.out.println(i1);
        }
        int i = random.nextInt()    ;

    }

}
