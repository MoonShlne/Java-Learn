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
public class OevrloadTest {
    public static void main(String[] args) {
        Overload over =new Overload();
        over.mOL(45);
        over.mOL(2,4);
        over.mOL("fsdfa");

        System.out.println(over.max(2, 5));
        over.max(21.4,234.3 );
        over.max(12.1,32.43,123);
    }
}
