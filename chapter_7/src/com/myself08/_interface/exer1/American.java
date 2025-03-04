package com.myself08._interface.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 15:01
 *  * 3、声明实现类美国人American，重写抽象方法，打印用刀叉吃饭
 */
public class American implements  Eatable{
    @Override
    public void eat() {
        System.out.println("叉子刀子吃吃吃");

    }
}
