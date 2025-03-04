package com.myself08._interface.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 16:27
 */
public interface IPower {
    void  power();
    public  static  void  say(){
        System.out.println("hhh");
    }
    public  default   void  say1(){
        System.out.println("hhh");
    }
}
