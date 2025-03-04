package com.myself04.example.exer5plus;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/27 15:48
 * 3. 案例：
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3)的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1） 生成随机数：Math.random(），返回值类型double;
 * 2） 四舍五入取整：Math.round(double d)，返回值类型long。
 * 年级[1,6]:(int)(Math.random() *6+1)
 * 分数[0,100] : (int)(Math.random() * 101)
 * با
 */
public class Student {
    int number;
    int state;
    int score;
public void sout(){
    System.out.println("所查找学生的学号是" + number + ",班级是" + state + ",分数是" + score);
}
}
