package myself03._extends.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/10 16:55
 */
public class Test12 {
    public static void main(String[] args) {
        Cylinder c1 =new Cylinder();
        c1.setRadius(2.3);
        c1.setLength(1.4);

        System.out.println(c1.findVolume());
    }
}
