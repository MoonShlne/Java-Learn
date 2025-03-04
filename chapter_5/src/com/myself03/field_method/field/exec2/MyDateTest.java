package com.myself03.field_method.field.exec2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/24 15:24
 */
public class MyDateTest {
    public static void main(String[] args) {
        Employee e1= new Employee();
        MyDate m1 =new MyDate();
        e1.birthday =m1;
        m1.year =1990;
        m1.month=12;
        m1.day=21;
        System.out.println(e1.birthday.year+"   "+e1.birthday.month+ "   "+e1.birthday.day);
    }
}
