package com.myself08._interface.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 15:02
创建Eatable数组，存储各国人对象，并遍历数组，调用eat()方法
 */
public class EatableTest {
    public static void main(String[] args) {
         Eatable [] list =new Eatable[]{new Chinese(),new American() , new Indian()};

        for (int i = 0; i < list.length ; i++) {
            list[i].eat();

        }
    }
}
