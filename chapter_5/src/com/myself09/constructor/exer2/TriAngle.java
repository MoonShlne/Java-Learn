package com.myself09.constructor.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/6 15:48
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngle {
    private  double base;
    private  double height;

    public void  setBase(double a){
        base =a;
    }
    public  double getBase(){
        return  base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public TriAngle(int a,int b){
        base =a;
        height=b;
    }
    public  double Area(){
        return base*height/2;
    }
}
