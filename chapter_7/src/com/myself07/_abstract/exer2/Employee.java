package com.myself07._abstract.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 16:54
 * private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
 * 提供必要的构造器；
 * abstract方法earnings(),返回工资数额；
 * toString()方法输出对象的name,number和birthday。
 */
public abstract class Employee {
    private  String name;
    private  int num;
    private  MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int num, MyDate birthday) {
        this.name = name;
        this.num = num;
        this.birthday = birthday;
    }

    public  abstract  double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", " + birthday.toString() +
                '}';
    }
}
