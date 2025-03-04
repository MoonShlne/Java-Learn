package myself03._extends.exer1;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/10 16:24
 * (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 */
public class KidTest {
    public static void main(String[] args) {
        Kid somekid=new Kid(2,1,1);

        somekid.setYearsOld(23);
        somekid.setSalary(0);
        somekid.setSex(3);
        somekid.printAge();
        somekid.manOrWoman();
        somekid.employeed();
    }
}
