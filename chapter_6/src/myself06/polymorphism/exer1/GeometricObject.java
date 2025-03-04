package myself06.polymorphism.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 13:16
 */
public class GeometricObject {
    private String color;
    private double weight;

    public  GeometricObject(){}

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  double  findArea(){
        return  0;
    }
}
