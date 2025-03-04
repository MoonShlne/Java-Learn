package com.myself12.wrapper;

import org.junit.Test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/21 15:15
 */
public class WrapperTest1 {
    @Test
    public void test(){
        String s1 = String.valueOf("123");
        System.out.println(s1);
        int i = Integer.parseInt(s1);
        System.out.println(i+1);
    }
}
