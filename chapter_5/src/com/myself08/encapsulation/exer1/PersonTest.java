package com.myself08.encapsulation.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/5 19:12
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person b =new Person();
        b.setAge(66);
        System.out.println(b.getAge());
        b.souts();

    }
}
