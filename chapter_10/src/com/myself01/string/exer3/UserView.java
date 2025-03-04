package com.myself01.string.exer3;

import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/16 13:29
 * （1）定义用户类，属性为用户名和密码，提供相关的getter和setter方法，构造器，toString()。
 *
 * （2）使用数组存储多个用户对象。
 *
 * （3）录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
 *     > 登录失败时，当用户名错误，提示没有该用户。
 *     > 登录失败时，当密码错误时，提示密码有误。
 */
public class UserView {
    User [] users = new User[3];
    private int  count=0;
    public void addUser(User user){
        users[count++] =user;
    }
    public  void  logIn(){
            System.out.println("库中的用户有");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
        boolean isFind =false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.nextLine();
        System.out.println("请输出密码");
        String password = scanner.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (userName.equals(users[i].getUserName()) ){
               isFind =true;
               if (password.equals(users[i].getPassword()) ){
                   System.out.println("登陆成功"+users[i].getUserName());
                   break;
               }
               else {
                   System.out.println("密码错误");
               }
            }
        }
        if (!isFind){
            System.out.println("未找到用户");
        }
    scanner.close();
    }
}
