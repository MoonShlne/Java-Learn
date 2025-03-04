package com.myself05.overload_args.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/30 18:01
 * 练习2：
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 *
 * 练习3：
 * 定义三个重载方法max()：
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class Overload {
    public void mOL(int x) {
        System.out.println(x*x);
    }

    public void mOL(int x, int y) {
        System.out.println(x * y);
    }

    public void mOL(String str) {
        System.out.println(str);
    }

    public int max(int x, int y){
        return (x>y)?x:y;
    }
    public  void  max(double x,double y){
        System.out.println(Math.max(x,y));
    }
    public  void  max(double x,double y,double z){
        double max=x;
        if (max<y){
            max= y;
        }
        if (max<z){
            max =z;
        }
        System.out.println(max);
    }
}
