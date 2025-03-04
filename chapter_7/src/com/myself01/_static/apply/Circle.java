package com.myself01._static.apply;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/16 13:46
 */
public class Circle {
    private double radius;
    private  int id  ;
    private   static int total;
    private static int idCount =1001;
    public Circle(){
        this.id=idCount;
        idCount++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", radius=" + radius +
                '}';
    }


}
class  test{
    public static void main(String[] args) {
        Circle c1 =new Circle(1);
        Circle c2 =new Circle(2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
