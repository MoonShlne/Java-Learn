package com.myself01.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 *
 * @author 尚硅谷-宋红康
 */
public class LambdaTest1 {
    //语法格式一：无参，无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();

        System.out.println("***********************");

        Runnable r2 = () -> {
            System.out.println("你妈妈的吻");
        };
        r2.run();


    }

    //语法格式二：Lambda 需要一个参数，但是没有返回值。
    @Test
    public void test2() {

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");

        System.out.println("*******************");
        Consumer<String> consumer = (String s) -> {
            System.out.println(s);
        };
        consumer.accept("四只黄鹂鸣翠柳，两行白鹭上青天");
    }

    //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test3() {

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("如果大学可以重来，你最想重来的事是啥？");

        System.out.println("*******************");
        Consumer<String> c2 = (s) -> {
            System.out.println(s);
        };
        c2.accept("猪神黄昏");

    }


    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4() {
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("世界那么大，我想去看看");

        System.out.println("*******************");
        Consumer<String> c2 = s -> {
            System.out.println(s);
        };
        c2.accept("语法糖爽爽爽");

    }

    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5() {

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };

        System.out.println(com1.compare(12, 21));

        System.out.println("*****************************");

        Comparator<Integer> comparator = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(comparator.compare(21,12));


    }

    //语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test6() {

        Comparator<Integer> com1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };

        System.out.println(com1.compare(12, 6));

        System.out.println("*****************************");

        Comparator<Integer> com2 =(o1,o2) ->o1.compareTo(o2);
        System.out.println(com2.compare(21, 21));
    }

    @Test
    public void test7() {
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("怀才就像怀孕，时间久了总会让人看出来");

        System.out.println("*****************************");


    }

}
