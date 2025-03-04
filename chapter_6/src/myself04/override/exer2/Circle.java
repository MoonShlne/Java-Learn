package myself04.override.exer2;

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
