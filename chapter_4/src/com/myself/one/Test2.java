package com.myself.one;

import java.awt.*;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/13 16:27
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("输入学生个数");
        int num= scanner.nextInt();
        int[] student=new  int[num];

//        student[0]= scanner.nextInt();
//        student[1]= scanner.nextInt();
//        student[2]= scanner.nextInt();
//        student[3]= scanner.nextInt();
//        student[4]= scanner.nextInt();
        for (int i = 0; i <num ; i++) {
            System.out.println("输入第"+i+"个学生成绩");
            student[i]=scanner.nextInt();
        }
        int max=student[0];
        String grade;
        for (int i = 0; i < student.length; i++) {
            if (student[i]>=90){
                grade="A";
            }
            else if (student[i]>=80){
                grade="B";
            }
            else if (student[i]>=70){
                grade="C";
            }
            else {
                grade="D";
            }
            System.out.println("student"+i+"score is"+student[i]+"grade is"+grade) ;
            if (student[i]>max){
                max=student[i];
            }
        }
        System.out.println("最高分是"+max);

    }
}
