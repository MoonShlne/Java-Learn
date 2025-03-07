package com.myself08._interface.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/18 15:00
 * 1、声明接口Eatable，包含抽象方法public abstract void eat();
 * 2、声明实现类中国人Chinese，重写抽象方法，打印用筷子吃饭
 * 3、声明实现类美国人American，重写抽象方法，打印用刀叉吃饭
 * 4、声明实现类印度人Indian，重写抽象方法，打印用手抓饭
 * 5、声明测试类EatableTest，创建Eatable数组，存储各国人对象，并遍历数组，调用eat()方法
 */
public interface Eatable {
    public  abstract  void  eat();
}
