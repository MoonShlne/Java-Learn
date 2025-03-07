package com.myself05.overload_args.valuetransfer.exer1;

import java.awt.*;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/3 14:39
 * 1. 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * 2. 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)。
 * 3. 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *     例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 4. 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 */
public class Circle {
    double radius;
    public  double findArea(){
         return Math.PI*radius*radius;
    }

}
class PassObject{
    public void printAreas(Circle c, int time){
        int i = 1;
        for (; i <= time; i++) {
            c.radius=i;
            System.out.println("半径为"+i+"面积为" +c.findArea());
        }
        c.radius=i;
    }
}

