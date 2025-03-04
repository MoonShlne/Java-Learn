package com.myself01._static.exer1;

import java.util.PriorityQueue;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/16 14:02
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。
 * 账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 *
 * 考虑：哪些属性可以设计成static属性。
 */
public class Bank {
    private  int id;
    private String password;
    private  double balance;
    private static double rate =0.01;
    private  double minBalance;
    private static int idCount=1;
    public Bank(){
        this.id= idCount;
        idCount++;
        password ="123456";
    }

    public Bank(String password, double balance, double minBalance) {
        this();
        this.password = password;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", minBalance=" + minBalance +
                '}';
    }

    public static void main(String[] args) {
        Bank b1 =new Bank("123123",1000,0);
        Bank b2 =new Bank("1231231",10001,10);
        Bank b3 =new Bank("12312132531",100101,101);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
