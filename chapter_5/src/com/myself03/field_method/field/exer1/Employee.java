package com.myself03.field_method.field.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/24 15:14
 * 案例：
 * 声明员工类Employee,包含属性:编号id、姓名name、年龄age、薪资salary。
 * 声明EmployeeTest测试类,并在main方法中,创建2个员工对象,并为属性赋值,并打印两个员工的信息。1
 */
public class Employee {
    int id;
    String name;
    int age;
    double salary;

    public void show() {
        System.out.println(id + " " + name + " " + salary);
    }

    public String show1() {
        String info = id + " " + name + " " + salary;
        return info;
    }
}

