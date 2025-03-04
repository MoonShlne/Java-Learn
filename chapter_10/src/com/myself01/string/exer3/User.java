package com.myself01.string.exer3;

import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/16 13:23
 * （1）定义用户类，属性为用户名和密码，提供相关的getter和setter方法，构造器，toString()。
 * <p>
 * （2）使用数组存储多个用户对象。
 * <p>
 * （3）录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
 * > 登录失败时，当用户名错误，提示没有该用户。
 * > 登录失败时，当密码错误时，提示密码有误。
 */
public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return
                 userName  +"-"+ password  ;
    }



}
