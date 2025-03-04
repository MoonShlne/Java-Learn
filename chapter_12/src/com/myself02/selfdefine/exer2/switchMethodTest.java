package com.myself02.selfdefine.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/4 0:30
 */
public class switchMethodTest {
    public static <E> void method1(E[] e, int a, int b) {

        E c = null;
        c = e[a];
        e[a]= e[b];
        e[b]= c;

    }
    public static <E> void method2( E[] e){

    }

}
