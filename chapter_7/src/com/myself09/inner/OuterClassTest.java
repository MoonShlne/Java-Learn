package com.myself09.inner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/19 18:54
 */
public class OuterClassTest {
    public static void main(String[] args) {
//1.通过创造对象来实现接口
        Sub s1 =new Sub();
        s1.method();
//2.匿名实现类 重写方法实现
        A a1 = new A(){
            public  void method(){
                System.out.println("我无敌了");
            }
        };
        a1.method();


    }

}

interface  A{
    void  method();
}
class  Sub implements  A{
    public  void  method(){
        System.out.println("我实现了");
    }
}
