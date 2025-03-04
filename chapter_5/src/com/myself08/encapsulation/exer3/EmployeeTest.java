package com.myself08.encapsulation.exer3;

import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/5 19:43
 * 2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees=new  Employee[3];
        Scanner scanner =new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            employees[i] =new Employee();
            System.out.println("输入第"+i+"个人的name");
            employees[i].setName(scanner.next());
            System.out.println("输入第"+i+"个人的gender");
            employees[i].setGender(scanner.next().charAt(0));
            System.out.println("输入第"+i+"个人的age");
            employees[i].setAge(scanner.nextInt());
            System.out.println("输入第"+i+"个人的num");
            employees[i].setPhoneNum(scanner.next());
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());

        }
    }
}
