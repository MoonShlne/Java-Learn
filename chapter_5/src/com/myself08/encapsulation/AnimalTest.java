package com.myself08.encapsulation;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/5 18:42
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 =new Animal();
        a1.name="pig";

        a1.gogogo();
    }
}
class  Animal{
    String name;
    private int leg;


   public void setLeg(int a) {
       if (a <= 0 && a % 2 != 0) {
           System.out.println("非法输入");
       } else {
           leg = a;
       }
   }
    public void  gogogo(){
        System.out.println(name+"托着它的"+leg+"条腿狂冲！");
    }


}
