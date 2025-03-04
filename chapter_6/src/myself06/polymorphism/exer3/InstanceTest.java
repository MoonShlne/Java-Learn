package myself06.polymorphism.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 14:21
 * 建立InstanceTest 类，在类中定义方法method(Person e);
 * 在method中:
 * (1)根据e的类型调用相应类的getInfo()方法。
 * (2)根据e的类型执行：
 * 如果e为Person类的对象，输出：
 * “a person”;
 * 如果e为Student类的对象，输出：
 * “a student”
 * “a person ”
 * 如果e为Graduate类的对象，输出：
 * “a graduated student”
 * “a student”
 * “a person”
 */
public class InstanceTest {
    public void method(Person e) {
        System.out.println(e.getInfo());
        if (e instanceof Graduate) {
            System.out.print("a graduated student \n a student \n a person");
        } else if (e instanceof Student) {
            System.out.print("a student \n a persion");
        } else  {
            System.out.println("a person");
        }


    }

    public static void main(String[] args) {
        InstanceTest test =new InstanceTest();
        Person p1 =new Person();
        Person p2 =new Graduate();
        Person p3 =new Student();

        test.method(p3);



    }
}
