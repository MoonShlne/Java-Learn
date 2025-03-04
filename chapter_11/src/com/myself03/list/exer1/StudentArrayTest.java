package com.myself03.list.exer1;

import com.myself01.collection.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/17 13:46
 * (2) 使用ArrayList集合，保存录入的多个学生对象。
 * <p>
 * (3) 循环录入的方式，1：继续录入，0：结束录入。
 * <p>
 * (4) 录入结束后，用foreach遍历集合。
 */
public class StudentArrayTest {
    public static void main(String[] args) {

        ArrayList studnets = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("学生信息录入");

        while (true) {
            System.out.println("1：继续录入，0：结束录入");
            int makeSure = scanner.nextInt();
            if (makeSure == 1) {
                Student s = new Student();
                System.out.println("输入名称");
                s.setName(scanner.next());
                System.out.println("输入年龄");
                s.setAge(scanner.nextInt());
                studnets.add(s);

            } else if (makeSure == 0) {
                for (Object object : studnets) {
                    System.out.println(object);
                }
                break;
            } else {
                System.out.println("输入有误,重新输入");
            }

        }
        scanner.close();

    }


}
