package myself03._extends.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/10 16:41
 */
public class Cylinder extends  Circle {
    private  double length;

    public Cylinder() {
        this .length =1;
    }
    public  Cylinder(double radius){
        this .length =1;
        setRadius(radius);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return  findArea()*length;
    }
}
