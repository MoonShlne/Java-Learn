package com.myself01.use.exer1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/27 22:50
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.getBirthday().getYear() - e2.getBirthday().getYear() != 0) {
                    return e1.getBirthday().getYear() - e2.getBirthday().getYear();
                } else if (e1.getBirthday().getMonth() != e2.getBirthday().getMonth()) {
                    return e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
                } else if (e1.getBirthday().getDay() != e1.getBirthday().getDay()) {
                    return e1.getBirthday().getDay() - e2.getBirthday().getDay();
                } else {
                    return e1.getName().compareTo(e2.getName());
                }

            }
        };
        TreeSet<Employee> employees = new TreeSet<Employee>();
        employees.add(new Employee("小红", 11, new MyDate(2003, 13, 1)));
        employees.add(new Employee("小橙", 14, new MyDate(2003, 1, 12)));
        employees.add(new Employee("小蓝", 167, new MyDate(2002, 1, 1)));
        employees.add(new Employee("小绿", 15, new MyDate(2002, 11, 1)));
        employees.add(new Employee("小紫", 18, new MyDate(2003, 1, 12)));
//        employees.add(111);

        for (Object o : employees) {
            System.out.println(o);
        }
    }
}
