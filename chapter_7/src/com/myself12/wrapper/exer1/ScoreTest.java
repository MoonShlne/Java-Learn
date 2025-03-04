package com.myself12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/21 15:27
 */
public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in)    ;
        int maxScore=0;

        while (true){
            System.out.println("输入学生成绩，输入负数结束");
            int score = scanner.nextInt();
            if (score<0){
                break;
            }
            else {
//                Integer  integerScore = score;
                v.addElement(score);

            }
        }


        for (int i = 0; i < v.size(); i++) {
             int a = (int) v.elementAt(i);
            System.out.println("第"+i+1+"个同学的成绩是"+v.elementAt(i));
            if (maxScore<a ){
            maxScore=a;
            }
        }
        System.out.println("最高分是"+maxScore);

        int MAXSCORE =100;
        for (int i = 0; i < v.size(); i++) {
            int a = (int) v.elementAt(i);
            if (MAXSCORE-a <10 ){
                System.out.println("第"+i+1+"个同学的成绩是A");
            }
            else if (MAXSCORE-a <20){
                System.out.println("第"+i+1+"个同学的成绩是B");
            }
            else if (MAXSCORE-a <30){
                System.out.println("第"+i+1+"个同学的成绩是C");
            }
            else {
                System.out.println("第"+i+1+"个同学的成绩是D");

            }


        }
    }
}