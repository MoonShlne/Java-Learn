package com.myself07._abstract.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 17:01
 * （3）定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。
 * 该类包括：private成员变量monthlySalary；
 * 提供必要的构造器；
 * 实现父类的抽象方法earnings(),该方法返回monthlySalary值；
 * toString()方法输出员工类型信息及员工的name，number,birthday。比如：SalariedEmployee[name = '',number = ,birthday=xxxx年xx月xx日]
 */
public class SalariedEmployee extends  Employee{
    private  double monthlySalary;

    public  SalariedEmployee(){}
    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int num, MyDate birthday, double monthlySalary) {
        super(name, num, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString()+
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
