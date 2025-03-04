package myself05._super.test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/11 14:43
 */
public class Person {
    String name;
    int age;


    public Person() {
        name="aa";
        age=123;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("大人吃饭");
    }

    public void sleep() {
        System.out.println("大人睡觉");
    }
}
