package com.myself03.field_method.field.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/24 15:16
 */
public class EmployeeTest {
    public static void main(String[] args) {


        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.id=1;
        e2.id=2;
        e1.name ="aag";
        e2.name ="pigger";
        e1.age=e2.age =21;
        e1.salary =100;
        e2.salary=200;

        e2.show();
        e1.show();


        System.out.println(e1.show1());
    }
}