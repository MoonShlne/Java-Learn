package com.myself02.reference;

import com.myself02.reference.data.Employee;
import com.sun.source.tree.IfTree;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *
 * 二、数组引用
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Employee>  supplier=Employee::new;
        System.out.println(supplier.get().getName());


    }

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> function = (id) ->new Employee(id);
        Employee apply = function.apply(3);

        Function<Integer,Employee> function1 = Employee::new;
        function1.apply(23);

    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction <Integer,String,Employee> biFunction = Employee::new ;
        Employee apply = biFunction.apply(2, "a");
    }

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer,Employee[]> function = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer length) {
                return new Employee[length];
            }
        };

        Function<Integer,Employee[]> function1 =Employee[]::new;

	}
}
