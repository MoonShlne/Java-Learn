package com.myself05.map.exer2;

import javax.swing.*;
import java.util.Map;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/20 21:07
 */
public class ProvinceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map model = CityMap.model;
        for (Object o : model.keySet()) {
            System.out.print(o + "  ");
            System.out.println();
        }
        System.out.println("请选择你所在的省份:");
        String province = scanner.next();
        if (model.keySet().contains(province)) {      //如果省份存在
            Object object = model.get(province);
            String[] arr = (String[]) object;
            for (Object o : arr) {                      //输出该省份的城市
                System.out.println(o + " ");
            }
            System.out.println("请输入所在城市");
            String city = scanner.next();
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(city)) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("信息登记完毕");
            } else {
                System.out.println("城市不存在");
            }

        } else {
            System.out.println("省份不存在");
        }


        scanner.close();
    }
}
