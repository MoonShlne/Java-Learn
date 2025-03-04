package com.myself04.block.exer;

import java.util.Date;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/16 15:10
 */
public class User {
    private String userName;
    private String password;
    private final long registrationTime;

    public User() {
        System.out.println("新用户注册");
        password ="123456";
        registrationTime=System.currentTimeMillis();
    }

    public User(String userName, String password) {

        this();

        this.userName = userName;
        this.password = password;
    }
    public  String getInfo(){
        return toString();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
}
