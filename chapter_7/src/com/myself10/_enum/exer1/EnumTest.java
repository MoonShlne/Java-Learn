package com.myself10._enum.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/20 16:12
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(GirlFriend.AAA);
    }

}


enum  GirlFriend{
    AAA(18);

    private  final  int age ;

    private  GirlFriend(int age) {
        this.age = age;
    }
}
