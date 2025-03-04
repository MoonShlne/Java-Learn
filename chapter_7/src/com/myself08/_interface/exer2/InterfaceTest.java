package com.myself08._interface.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 15:50
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo方法比较两个类的半径大小。
 */
public class InterfaceTest {
    public static void main(String[] args) {
         ComparableCircle c1 =new ComparableCircle(12);
        ComparableCircle c2 =new ComparableCircle(11);
        ComparableRectangle r1 = new ComparableRectangle(11,23);
        ComparableRectangle r2 = new ComparableRectangle(12,23);
//        System.out.println(c1.compareTo(c2));
        System.out.println(r1.compareTo(c1));
    }
}
