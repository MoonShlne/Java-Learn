package com.myself09.inner.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/19 18:41
 * 编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法public void test()打印尚硅谷。
 */
public class Test12 {
    public static void main(String[] args) {
//     Sub s1 =new Sub();
//     s1.test();

        new Object(){
            public void  test(){
                System.out.println("w t m z c l");
            }
        }.test();

    }
}
//class Sub {
//    public  void  test(){
//        System.out.println("w z c l");
//    }
//}