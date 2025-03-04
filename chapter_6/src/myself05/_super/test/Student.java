package myself05._super.test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/11 14:44
 */
public class Student extends Person {
    String school;

    public Student() {
    }

    public Student(String school) {
        this();
        this.school = school;
    }

    public void study(){
        System.out.println("学生学习");
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void sleep() {
        eat();
        System.out.println("学生睡觉");
        super.eat();
    }
    public  void  eatPlus(){
        super.eat();
    }
}
