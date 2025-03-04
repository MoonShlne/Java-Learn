package com.myself07._abstract.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 17:11
 * （5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem  {
    public static void main(String[] args) {
        Employee[] emp =new  Employee[2];
        emp[0]=new SalariedEmployee("zzx",110,new MyDate(2003,12,1),1999);
        System.out.println(emp[0].toString());


    }



}
