package com.myself05.overload_args.valuetransfer.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/3 14:52
 */
public class CircleTest   {
    public static void main(String[] args) {
        Circle c1 =new Circle();

        PassObject p1 =new PassObject();
        p1.printAreas(c1,7);
        System.out.println(c1.radius);

    }
}
