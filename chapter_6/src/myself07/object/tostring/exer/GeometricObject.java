package myself07.object.tostring.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/15 13:47
 */
public class GeometricObject {
protected  String color;
protected  double weight;

protected GeometricObject(){
    color="white";
    weight = 1.0;
}

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
