package com.myself03.stream;

import com.myself02.reference.data.Employee;
import com.myself02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 测试Stream的终止操作
 *
 * @author 尚硅谷-宋红康
 */
public class  StreamAPITest2 {

    //1-匹配与查找
    @Test
    public void test1(){
//        allMatch(Predicate p)——检查是否匹配所有元素。
//          练习：是否所有的员工的年龄都大于18
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().allMatch((employee -> employee.getAge() > 18)));


//        anyMatch(Predicate p)——检查是否至少匹配一个元素。
//         练习：是否存在员工的工资大于 10000
        System.out.println(employees.stream().anyMatch((employee -> employee.getAge() < 18)));

//        findFirst——返回第一个元素

    }

    @Test
    public void test2(){
        // count——返回流中元素的总个数
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().filter((employee -> employee.getAge() < 18)).count());
//        max(Comparator c)——返回流中最大值
//        练习：返回最高的工资：
        System.out.println(employees.stream().map(Employee::getSalary ).max(Double::compare));
//        min(Comparator c)——返回流中最小值
//        练习：返回最低工资的员工

//        forEach(Consumer c)——内部迭代
        employees.stream().forEach(System.out::println);
        employees.stream().forEach(s -> System.out.println(s));
    }

    //2-归约
    @Test
    public void test3(){
//        reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T
//        练习1：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream().reduce(0,Integer::sum));


//        reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
//        练习2：计算公司所有员工工资的总和
        List<Employee> employees = EmployeeData.getEmployees();
        System.out.println(employees.stream().map(Employee::getSalary).reduce(Double::sum));
    }

    //3-收集
    @Test
    public void test4(){
//        collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
//        练习1：查找工资大于6000的员工，结果返回为一个List或Set
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> list= employees.stream().filter(employee -> employee.getSalary()>6000).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println();

//        练习2：按照员工的年龄进行排序，返回到一个新的List中
        List<Employee> collect = employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).toList();
        collect.forEach(System.out::println);

    }
}
