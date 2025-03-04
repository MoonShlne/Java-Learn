package com.myself07._abstract.template;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 15:58
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNum p1 =new PrintPrimeNum();
        p1.count();
    }

}
abstract class Template{
    public void  count(){
        long start= System.currentTimeMillis();
        code();
        long end =System.currentTimeMillis();
        System.out.printf("用时间"+ (end-start));
    }
    public abstract  void  code() ;
}

class  PrintPrimeNum extends  Template{


    @Override
    public void code() {
        for (int i = 2; i < 100000; i++) { // 从 2 开始，因为 1 不是素数
            boolean isPrime = true; // 假设 i 是素数

            for (int j = 2; j <= Math.sqrt(i); j++) { // 只检查到 sqrt(i) 即可
                if (i % j == 0) { // 如果 i 能被 j 整除，则不是素数
                    isPrime = false;
                    break; // 找到因子后，可以退出循环
                }
            }

            if (isPrime) { // 如果没有找到因子，说明 i 是素数
                System.out.println(i); // 输出素数
            }
        }
    }
}
