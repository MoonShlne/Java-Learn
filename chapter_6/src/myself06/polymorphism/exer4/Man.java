package myself06.polymorphism.exer4;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/14 14:44
 * （2）在Man类中，包含
 * ①重写上面的方法
 * ②增加  public void smoke()：打印抽烟
 */
public class Man  extends  Person{
    @Override
    public void eat() {
        System.out.println("吃海参，足球踢的好！");
    }

    @Override
    public void toilet() {
        System.out.println("去男厕");
    }
public  void smoke (){
    System.out.println("我tm超级无敌狂抽抽抽！");
}
}
