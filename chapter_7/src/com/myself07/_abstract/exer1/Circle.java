package com.myself07._abstract.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 16:21
 */
public class Circle  extends  GeometricObject{
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
