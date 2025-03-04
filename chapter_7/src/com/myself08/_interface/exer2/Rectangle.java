package com.myself08._interface.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:12
 */
public class Rectangle {
    private  double wight;
    private  double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
