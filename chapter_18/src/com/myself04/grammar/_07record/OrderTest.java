package com.myself04.grammar._07record;

import org.junit.Test;

import java.util.HashSet;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:58
 * @Version 1.0
 */
public class OrderTest {
    @Test
    public void test1(){
        Order order1 = new Order(1001,"orderAA");
        //测试toString()
        System.out.println(order1);

        //测试getter()
        System.out.println(order1.orderId());
        System.out.println(order1.orderName());

        Order order2 = new Order(1001,"orderAA");
        //测试equals()
        System.out.println(order1.equals(order2));

        //测试hashCode()和equals()
        HashSet<Order> set = new HashSet<>();
        set.add(order1);
        set.add(order2);
        System.out.println(set);
    }


}
