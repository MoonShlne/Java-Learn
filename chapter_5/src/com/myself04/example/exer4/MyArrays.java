package com.myself04.example.exer4;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/26 16:58
 * 案例：
 * 根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 * 涉及到的方法有:求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、
 * 数组排序(默认从小到大排序)、查找等
 * atabase
 * jclasslib
 * Notificat
 */
public class MyArrays {
    /**
     * 获取int 的最大值
     * @param arr   要获取的最大值数组
     * @return  数字最大值
     */
    public  int getMax(int [] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max){
                max=arr[i];
            }
        }
        return  max;
    }
}
