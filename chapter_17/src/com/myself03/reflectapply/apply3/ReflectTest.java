package com.myself03.reflectapply.apply3;

import com.myself03.reflectapply.data.Person;
import org.junit.Test;

import javax.naming.Name;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/23 19:51
 */
public class ReflectTest {
    @Test
    public void test() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        //调用指定的属性
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field age = clazz.getField("age");
        age.get(person);
        age.set(person, 11);
        age.get(person);
        System.out.println(person);


    }

    @Test
    public void test2() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        //修改private属性 name
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field nameFiled = clazz.getDeclaredField("name");
        nameFiled.setAccessible(true);
        System.out.println(nameFiled.get(person));
        nameFiled.set(person, "fasfa");
        System.out.println(nameFiled.get(person));
    }


    @Test
    public void test3() throws Exception{
        //修改private static属性     private static String info;
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field infoFiled = clazz.getDeclaredField("info");
        infoFiled.setAccessible(true);
        System.out.println(infoFiled.get(person));
        infoFiled.set(Person.class,"aaa");


    }

    @Test
    public void test4() throws Exception{
        //调用私有方法
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();

        Method showNation = clazz.getDeclaredMethod("showNation", String.class, int.class);
        showNation.setAccessible(true);
        System.out.println(showNation.invoke(person, "china", 22));

    }

    @Test
    public void test5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //调用静态方法
        Class<Person> clazz = Person.class;
        Method showInfo = clazz.getDeclaredMethod("showInfo");
        showInfo.invoke(null);

    }

    @Test
    public void test6() throws  Exception{
        //掉用构造器
        Class<Person> clazz = Person.class;
        Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Person person = declaredConstructor.newInstance("haha", 11);
        System.out.println(person);


    }

    @Test
    public void test7() throws  Exception{
        Class<Person> clazz = Person.class;
        Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(int.class);
        declaredConstructor.setAccessible(true);
        Person person = declaredConstructor.newInstance( 11);
        System.out.println(person);
    }
}
