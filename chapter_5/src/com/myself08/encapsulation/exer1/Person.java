package com.myself08.encapsulation.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/5 19:11
 * 案例：
 * 创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * <p>
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * <p>
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 */
public class Person {
    private int age;

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            System.out.println("输入非法");
        }
        age = a;
    }

    public int getAge() {
        return age;
    }
    public void   souts(){
        System.out.println(getAge());
    }
}
