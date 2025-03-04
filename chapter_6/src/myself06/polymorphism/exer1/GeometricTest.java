package myself06.polymorphism.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 13:48
 * 定义一个测试类GeometricTest，
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型）。
 */
public class GeometricTest {
    public  boolean  equalsArea(GeometricObject g1 ,GeometricObject g2){
        return  g1.findArea() ==g2.findArea();
    }
    public double displayGeometricObject(GeometricObject g1){
         return g1.findArea();
    }

    public static void main(String[] args) {
        GeometricObject g1 = new Circle(12,"red",1);
        GeometricObject g2 =new MyRectangle("blue",1,10,20);
        GeometricObject g3 = new Circle(12,"red",1);

        GeometricTest test  =new GeometricTest();
        System.out.println(test.displayGeometricObject(g1));
        System.out.println(test.displayGeometricObject(g2));

        System.out.println(test.equalsArea(g1, g2));
        System.out.println(test.equalsArea(g1, g3));


    }
}
