package com.myself09.inner;

import com.myself01._static.interview.StaticTest;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/19 16:31
 */
public class InnerClassTest { //外部类
    public static void main(String[] args) {
        InnerClassTest i1 = new InnerClassTest();
        innerClass i2 = i1.new innerClass();
        i1.eat();
    }

    String name = "out";

    public void eat() {
        System.out.println("就不吃");
    }


    public class innerClass {
        String name = "inner";
        int age = 9;

        public void eat() {
            System.out.println("吃吃吃");
        }

        public void sou() {
            System.out.println(InnerClassTest.this.name);
            eat();
            InnerClassTest.this.eat();
        }

    }
    public  static  class  staticInner{
        String name ="static";
        int age= 3433;

        public  void  eat(){
            System.out.println("static");
        }
    }


}
