package com.myself01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/23 13:37
 */
public class ReflectionTest {

    @Test
    public void test1(){
        Person p1 = new Person();
        p1.show();
        p1.age =10;
        System.out.println(p1);

    }


    @Test
    public void test2() throws Exception {
    Class <Person> clazz = Person.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Person tom = (Person) constructor.newInstance("tom", 11);
        System.out.println(tom);


        tom.age=12;
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(tom,"aa");
        System.out.println(tom);

        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object invoke = showNation.invoke(tom,"china");
        System.out.println(invoke.toString());
    }
}
