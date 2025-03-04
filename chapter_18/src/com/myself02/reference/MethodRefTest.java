package com.myself02.reference;

import com.myself02.reference.data.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 * <p>
 * Created by shkstart.
 */
public class MethodRefTest {

    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("asdf");

        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("safs");

        Consumer<String> consumer2 = System.out::print;
        consumer2.accept("真的是你啊aa ");

    }

    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2() {
        Employee employee = new Employee(11, "a a g");
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return employee.getName();
            }
        };
        System.out.println(supplier.get());

        Supplier<String> supplier1 = () -> employee.getName();
        System.out.println(supplier1.get());

        Supplier<String> supplier2 = employee::getName;
        System.out.println(supplier2.get());


    }

    // 情况二：类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    public void test3() {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(11, 12));
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o1, o2);

        System.out.println(comparator1.compare(12, 123));


        Comparator<Integer> comparator3 = Integer:: compare;
        System.out.println(comparator3.compare(1, -1));

    }


    //Function中的R apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4() {
        Function<Double,Long> function =Math::round;

    }

    // 情况三：类 :: 实例方法
    // Comparator中的int comapre(T t1,T t2)
    // String中的int t1.compareTo(t2)
    @Test
    public void test5() {
        Comparator<String> comparator =String::compareTo;

    }

    //BiPredicate中的boolean test(T t1, T t2);
    //String中的boolean t1.equals(t2)
    @Test
    public void test6() {
        BiPredicate<String,String> biPredicate = (s1,s2)->s1.equals(s2);

        biPredicate.test("a","a");

        BiPredicate<String,String> biPredicate1 = String::equals;;
        System.out.println(biPredicate1.test("1", "2"));

    }

    // Function中的R apply(T t)
    // Employee中的String getName();
    @Test
    public void test7() {

    }

}
