package myself03._extends.exer2;

import myself03._extends.exer1.ManKind;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/10 16:40
 */
public class Circle {
    private  double radius;

    public Circle() {
        this.radius = 1;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double  findArea(){
        return Math.PI*radius*radius;
    }
}
