package com.myself04.example.exer5plus;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/27 15:49
 */
public class StudentTest {
    public static void main(String[] args) {

        //学生信息赋值
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }
        StudentUtil util =new StudentUtil();
        util.find(students,2);
        System.out.println("*(*****************************");
        util.sortByScore(students);
//        //问题一：打印出3年级(state值为3）的学生信息。
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].state == 3) {
//                students[i].sout();
//            }
//        }
////        问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
//        Student stu =new Student();
//        for (int i = 0; i < students.length-1; i++) {
//            for (int j = 0; j < students.length-i-1; j++) {
//
//                if (students[j].score>students[j+1].score){
////                    temp = students[i+1].score;
////                    students[i+1].score=students[i].score;
////                    students[i].score=temp;
//                    stu = students[j];
//                    students[j]=students[j+1];
//                    students[j+1]=stu;
//                }
//            }
//        }
//        System.out.println("******************************************");
//
//        for (int i = 0; i < students.length; i++) {
//            students[i].sout();
//        }
//        //问题一：打印出3年级(state值为3）的学生信息。s

    }
}
