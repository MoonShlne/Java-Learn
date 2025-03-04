package com.myself.one;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/13 15:34
 */
public class OneArrayTest1 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------");
        int[] arr2=arr;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("------------");
        arr2[0]=9;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
