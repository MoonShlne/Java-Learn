package com.myself04.block;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/16 15:00
 */
public class Block {
    public static void main(String[] args) {
        System.out.println(Person.a);
    }
}
class  Person{
static  int a=1;


    {
        System.out.println("not Static");
    }
     static {
        System.out.println("static");
    }

}
