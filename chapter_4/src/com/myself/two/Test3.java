package com.myself.two;

import java.util.logging.Level;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/15 21:17
 * 创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同。
 * 举例4:
 */
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int num;
            boolean isUnique;
            do {
                num = random.nextInt(30) + 1; // 生成1到30之间的随机数
                isUnique = true;

                // 检查是否已经存在相同的数字
                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);

            arr[i] = num; // 将唯一的数字放入数组
        }

        // 输出数组
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}