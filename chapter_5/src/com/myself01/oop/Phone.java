package com.myself01.oop;

import javax.crypto.interfaces.PBEKey;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/21 19:48
 */
public class Phone {
    String grand;
    double price;

    public  void call(){
        System.out.println("打电话");
    }

    public  void massage (String massage){
        System.out.println("发送信息"+massage);
    }
    public  void  playgame(){
        System.out.println("玩玩玩");
    }

}



