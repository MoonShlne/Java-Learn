package com.myself.one;

import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/13 15:57
 */
//案例：输出英文星期几用一个数组，保存星期一到星期天的 7 个英语单词，从键盘输入 1 一 7 ，显示对应的单词
public class Test1 {
    public static void main(String[] args) {
         String[] week={"Monday","Tuesday","Wednesday","Tuesday","Friday","Sunday"};
        Scanner scanner =new Scanner(System.in );
        System.out.println("输入日期");
        int choose= scanner.nextInt();
        if (choose >1&&choose<7){
            System.out.println("你输入的是"+week[choose-1]);
        }
        else {
            System.out.println("输入有误");
        }


        scanner.close();

    }
}
