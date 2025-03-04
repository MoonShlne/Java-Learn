package myself06.polymorphism.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 13:21
 */
public class Circle extends  GeometricObject {
    private  double radius;

    public  Circle(){}
    public  Circle(double radius,String color, double weight){
        super(color,weight);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double findArea(){
        return Math.PI*radius*radius;
    }
}
