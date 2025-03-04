package com.myself07._abstract.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 16:25
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject g1 =new Circle(2    );
        GeometricObject g2 =new MyRectangle(2,3);
        System.out.println(g1.findArea());
        System.out.println(g2.findArea());
    }
}
