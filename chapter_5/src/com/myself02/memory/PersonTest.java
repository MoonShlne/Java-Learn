package com.myself02.memory;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/22 17:33
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.name="aag";
        p1.age=21;
        p1.gender='无';


        p1.eat();
        p1.interests("sleep ");
        Person p2 =new Person();
        p2.name ="pigger";
        p2.age=22;
        p2.gender='母';

    }

}
