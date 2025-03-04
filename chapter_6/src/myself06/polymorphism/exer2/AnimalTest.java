package myself06.polymorphism.exer2;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/13 16:09
 * 在判断Animal是Dog或Cat时，
 * 向下转型，并调用各自特有的方法。
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal test =new Animal();
        Animal A1 =new Cat();
        Animal A2=new Dog();
        A1.adopt(A1);



    }
}


class Animal {
    public void adopt(Animal animal) {
        eat();
        if (animal instanceof  Cat){
            Cat C1 = (Cat) animal;
            C1.say();
        }
        else if (animal instanceof  Dog){
            Dog D1 = (Dog) animal;
            D1.bark();
        }
    }

    public void eat() {
        System.out.println("吃吃吃");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃吃吃");
    }
    public  void  bark(){
        System.out.println("狗叫~");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("小猫吃吃吃");
    }
    public void  say(){
        System.out.println("喵喵喵");
    }
}
