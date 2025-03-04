package com.myself05.exer.exer3;

import javax.xml.transform.Source;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/25 18:59
 */
public class Exer3 {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("aage",-1);
            System.out.println(p1.getLifeValue());
        } catch (Exception e) {
            throw new NoLifeValueException("血不能为负");
        }


    }
}
