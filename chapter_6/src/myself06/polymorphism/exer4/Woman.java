package myself06.polymorphism.exer4;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 14:46
 * （3）在Woman类中，包含
 * ①重写上面的方法
 * ②增加 public void makeup()：打印化妆
 */
public class Woman  extends  Person{
    @Override
    public void eat() {
        System.out.println("吃群英烩菜");
    }

    @Override
    public void toilet() {
        System.out.println("去女厕");
    }
    public void  makeup(){
        System.out.println("化妆");
    }
}
