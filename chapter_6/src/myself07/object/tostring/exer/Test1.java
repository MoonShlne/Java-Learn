package myself07.object.tostring.exer;

/**
 * @author polar
 * @version 1.0
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；利用equals方法判断其半径是否相等；
 * 利用toString()方法输出其半径。
 * @since 2024/11/15 13:59
 */
public class Test1 {
    public static void main(String[] args) {
        Circle c1=new Circle(1.2);
        Circle c2 =new Circle(1.2);
        Circle c3 =new Circle(1.3);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        if (c1.color==c2.color){
            System.out.println("yes");
        }
    }
}
