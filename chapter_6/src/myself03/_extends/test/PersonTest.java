package myself03._extends.test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/10 16:03
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person= new Person();
        Student student = new Student();

        person.eat();
        person.sleep();

        student .eat();


        System.out.println(student.getClass());
        System.out.println(person.getClass());
        System.out.println(student.getClass().getSuperclass().getSuperclass());
        System.out.println(person.getClass().getSuperclass());
    }
}
