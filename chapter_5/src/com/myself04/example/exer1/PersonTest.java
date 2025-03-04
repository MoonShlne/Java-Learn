package com.myself04.example.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/26 15:42
 *  * （1)创建Person类的对象I设置该对象的name、age和gender属性，
 *  * 调用study方法，输出字符串"studying";
 *  * 调用showAge()方法,返回age值;
 *  * 调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如: 2岁。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.study();

        System.out.println(p1.showAge());
        p1.addAge(3);
        System.out.println(p1.showAge());
    }
}
