package com.myself05.overload_args.valuetransfer.exer2;

import java.util.Arrays;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/3 19:58
 */
public class MyArraysTest2 {
    public static void main(String[] args) {
        MyArrays  m1 =new MyArrays();
        int[] arr ={1,2,5,3,623,123,534};
        m1.sort(arr,"asc");
        System.out.println(Arrays.toString(arr));
    }
}
