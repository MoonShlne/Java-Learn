package com.myself.two;

import java.util.NavigableMap;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/14 18:37
 */
public class Test1 {
    public static void main(String[] args) {
        int arr1[][] ={{1,2,34,45},{1,2131,1},{1,32,1,23,1,2}};
        int num =0;
        System.out.println(arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            for(int j =0;j<arr1[i].length;j++){
                num+=arr1[i][j];
                System.out.println(arr1[i][j]);

            }
        }
        System.out.println(num );

    }
}
