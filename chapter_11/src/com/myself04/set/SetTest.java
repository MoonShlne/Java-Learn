package com.myself04.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/19 19:36
 */
public class SetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("aa");
        hashSet.add("3");
        hashSet.add("cc");
        hashSet.add("5");


        for (Object o:hashSet){
            System.out.println(o);
        }

    }
}
