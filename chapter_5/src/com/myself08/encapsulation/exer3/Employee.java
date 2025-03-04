package com.myself08.encapsulation.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/5 19:08
 * 案例：普通员工类
 * （1）声明员工类Employee，
 * - 包含属性：姓名、性别、年龄、电话，属性私有化
 * - 提供get/set方法
 * - 提供String getInfo()方法
 * （2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNum;

    public void setAge(int a) {
        age = a;
    }

    public void setName(String na) {
        name = na;
    }
    public void setGender(char g) { 
        gender= g;
    }
    public void setPhoneNum(String p) {
        phoneNum = p;
    }

    public  int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
//     * - 提供String getInfo()方法

    public String getInfo(){

         return "Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Phone: " + phoneNum;

    }

}
