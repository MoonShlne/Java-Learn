package com.myself10._enum.exer2;

import com.myself11.annotation.juint.MyAnnotation;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/20 16:13
 * 案例：颜色枚举类Color(使用enum声明)
 *
 * 1、声明颜色枚举类：7个常量对象：RED, ORANGE, YELLOW, GREEN, CYAN, BLUE,PURPLE;
 *
 * 2、在测试类中，使用枚举类，获取绿色对象，并打印对象。
 */
public enum Color {
    RED,ORANGE,YELLOW,GREEN,CYAN,BLUE,PURPLE;
}

class  ColorTest{
    public static void main(String[] args) {
        System.out.println(Color.GREEN);
    }
}
