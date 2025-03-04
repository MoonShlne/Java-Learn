package myself06.polymorphism.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 13:25
 */
public class MyRectangle extends  GeometricObject {
    private  double width;
    private double height;

    public  MyRectangle(){}

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
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
        return width*height;
    }
}
