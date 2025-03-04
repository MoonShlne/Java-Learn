package myself06.polymorphism.apply;

import myself03._extends.test.Person;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/13 16:09
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal test =new Animal();
        Animal d1 =new Cat();
        d1.adopt(d1);

    }
}


class Animal {
    public void adopt(Animal animal) {
        animal.eat();
    }

    public void eat() {
        System.out.println("吃吃吃");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃吃吃");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("小猫吃吃吃");
    }
}
