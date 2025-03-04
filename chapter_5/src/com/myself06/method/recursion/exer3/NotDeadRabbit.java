package com.myself06.method.recursion.exer3;

import java.security.PublicKey;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/4 17:18
 */
public class NotDeadRabbit {
    public static void main(String[] args) {
//        案例：不死神兔
//        用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契(Fibonacci)。
//        在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
//        再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
//        问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
//
//                月份       1    2   3    4    5
//                兔子对数    1    1   2    3    5
NotDeadRabbit n1 =new NotDeadRabbit();
        System.out.println(n1.getRabbitNum(24));

    }
    public int  getRabbitNum(int month){
    if (month==1|month==2){
        return 1;
    }
    else return getRabbitNum(month-1)+getRabbitNum(month-2);
    }
}
