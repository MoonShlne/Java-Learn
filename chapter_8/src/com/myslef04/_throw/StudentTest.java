package com.myslef04._throw;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/25 16:55
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();


        try {
            s.setId(-10);
        } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.println(s);
    }


}

class Student {
    int id;

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new RuntimeException("aa");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
