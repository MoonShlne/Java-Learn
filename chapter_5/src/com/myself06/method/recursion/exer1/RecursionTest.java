package com.myself06.method.recursion.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/4 14:21
 */
public class RecursionTest {
    public static void main(String[] args) {
//        1，计算累加值
        RecursionTest r1 =new RecursionTest();
        System.out.println(r1.getsum(100));
//        2.计算n的阶乘
        System.out.println(r1.jiecheng(0));
        System.out.println(r1.fibonacci(10));
    }


    /**
     *
     * @param x 想求累加的数字
     * @return  累加 值
     */
    public int getsum(int x){
        if (x==1){
            return 1;
        }
        else {
            return x + getsum(x-1);
        }

    }

    /**
     *
     * @param x
     * @return  阶乘结果
     */
    public int jiecheng (int x){
        if (x==0){
            return 1;
        }
        if (x==1){
            return 1;
        }
        return x* jiecheng(x-1);
    }

    /**
     *
     * @param x 所求斐波那契数的位
     * @return  值
     */
    public int fibonacci(int x){
        if (x == 2 | x == 1) {

            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

}
