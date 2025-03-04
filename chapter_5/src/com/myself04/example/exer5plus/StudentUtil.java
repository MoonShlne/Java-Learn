package com.myself04.example.exer5plus;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/27 18:41
 */
public class StudentUtil {

    //问题一：打印出x年级(state值为3）的学生信息。

    /**
     * 找出x班级的学生
     * @param arr 想要查找的学生类数字
     * @param x   想要查找的你班级
     */
    public void find(Student[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].state == x) {
                arr[i].sout();
            }
        }
    }

    /**
     * @param arr 想要排序的学生类数组
     */
    public void sortByScore(Student[] arr) {
        Student stu = new Student();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].score > arr[j + 1].score) {
//                    temp = students[i+1].score;
//                    students[i+1].score=students[i].score;
//                    students[i].score=temp;
                    stu = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = stu;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].sout();


        }

    }


}
