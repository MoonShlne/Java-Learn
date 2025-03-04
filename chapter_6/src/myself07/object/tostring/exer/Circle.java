package myself07.object.tostring.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/15 13:52
 */
public class Circle extends  GeometricObject{
    private  double radius;

    public  Circle(){}

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
    public  double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this ==obj){
            return true;
        }
        else if (obj instanceof  Circle){
            return this.radius == ((Circle) obj).radius;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "半径为"+this.radius;
    }
}
