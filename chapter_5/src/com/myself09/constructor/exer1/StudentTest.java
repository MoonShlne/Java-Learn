package com.myself09.constructor.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/6 15:25
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("aag", 11);
        Student s3 = new Student("pig", 32, "龙湾小学");
        Student s4 = new Student("zzx", 22, "新安怡高", "火车");
        s1.InFo();
        s2.InFo();
        s3.InFo();
        s4.InFo();
    }
}
