package com.myself.two;

import java.util.Arrays;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/21 15:12
 */
public class ArraysUntiTest {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,3,4,5};
        int[] arr2 ={1,2,3,4,5};
//        System.out.println(arr1==arr2);
        boolean isequal= Arrays.equals(arr1,arr2) ;
        System.out.println(isequal);


        Arrays.fill(arr1,1);
        System.out.println(Arrays.toString(arr1));


        //
        int index= Arrays.binarySearch(arr1,1);
        System.out.println(index);
    }
}
