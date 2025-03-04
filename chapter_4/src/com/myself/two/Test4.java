package com.myself.two;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/17 22:42
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t"  );
        }
    }
}
