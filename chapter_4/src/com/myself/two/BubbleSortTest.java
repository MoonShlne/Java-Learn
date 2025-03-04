package com.myself.two;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/19 20:49
 * 冒牌排序 int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int temp;
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
