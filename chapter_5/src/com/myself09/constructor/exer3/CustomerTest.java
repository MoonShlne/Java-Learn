package com.myself09.constructor.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/6 16:26
 * （1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 * （2）对Jane Smith操作。
 * 存入 100 元，再取出960元。再取出2000元。
 * 打印出Jane Smith 的基本信息：
 *
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 =new Customer("Jane","Smith");
        Account account =new Account(1000,2000,0.0123);
        c1.setaccount(account);
        c1.setaccount(new Account(1,1,1));

        c1.getaccount().setId(3);
        System.out.println(c1.getaccount().getId());
    }
}
