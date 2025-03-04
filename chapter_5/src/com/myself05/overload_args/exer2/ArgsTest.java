package com.myself05.overload_args.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/30 18:35
 */
public class ArgsTest {
    public static void main(String[] args) {
            ArgsTest a =new ArgsTest();
            a.Do(1,2,3,45,6);
    }
    public  void  Do( int ... a){
        System.out.println( a);
    }
}
