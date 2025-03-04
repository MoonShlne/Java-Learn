package com.myself07._abstract.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 16:23
 */
public class MyRectangle  extends  GeometricObject{
    private  double width;
    private  double height;

    public MyRectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public MyRectangle(String color, double weight, double height, double width) {
        super(color, weight);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return  width*height;
    }
}
