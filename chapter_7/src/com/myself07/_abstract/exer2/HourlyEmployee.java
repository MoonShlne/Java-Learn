package com.myself07._abstract.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/17 17:05
 * （4）参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。该类包括：
 * private成员变量wage和hour；
 * 提供必要的构造器；
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值；
 * toString()方法输出员工类型信息及员工的name，number,birthday。
 */
public class HourlyEmployee extends  Employee {
    private  double wage;
    private  double hour;

    public HourlyEmployee(double wage, double hour) {
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
