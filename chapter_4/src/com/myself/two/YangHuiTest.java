package com.myself.two;

import java.sql.SQLOutput;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/15 20:16
 */
public class YangHuiTest {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
//
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }

    }
}

