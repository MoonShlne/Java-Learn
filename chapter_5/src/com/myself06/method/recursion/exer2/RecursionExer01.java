package com.myself06.method.recursion.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/4 16:32
 * <p>
 * <p>
 * <p>
 * <p>
 */
public class RecursionExer01 {
    public static void main(String[] args) {
        RecursionExer01 r1 = new RecursionExer01();
        System.out.println(r1.function(10));
        System.out.println(r1.function2(10));
    }

    //    练习1：
//    已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
//    其中n是大于0的整数，求f(10)的值。
    public int function(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        }
        else return function(n +2)-function(n +1)*2;
    }

//     * 练习2：
//     * 已知有一个数列：f(0) = 1,f(1) = 4,
//     * f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
    public int function2(int n){
        if (n==0){
            return 1;
        }
        else if (n==1){
            return 4;
        }
        else {
            return 2*function2(n-1)+function2(n-2);
        }
    }
}
