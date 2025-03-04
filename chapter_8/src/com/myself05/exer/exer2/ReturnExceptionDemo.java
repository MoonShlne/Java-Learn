package com.myself05.exer.exer2;

/**
 * 输出结果：
 * 进入方法A
 * 用A方法的finally
 * 制造异常
 * 进入方法B
 * 调用B方法的finally
 *
 * @author shkstart
 * @create 0:57
 */
public class  ReturnExceptionDemo {
    static void methodA() throws Exception{
        try {
            System.out.println("进入方法A"); //2
            throw new Exception("制造异常"); //3
        } finally {
            System.out.println("用A方法的finally"); //1
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B"); //6
            return;
        } finally {
            System.out.println("调用B方法的finally"); //5
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage()); //4
        }

        methodB();
    }
}
