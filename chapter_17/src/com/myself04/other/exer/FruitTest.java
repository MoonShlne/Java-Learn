package com.myself04.other.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/25 21:58
 */

class Apple implements   Fruit{

    @Override
    public void squeeze() {
        System.out.println("苹果汁儿");
    }
}

class Watermelon implements   Fruit{
    @Override
    public void squeeze() {
        System.out.println("西瓜西瓜汁");
    }
}
class  Orange implements   Fruit{
    @Override
    public void squeeze() {
        System.out.println("橙汁美汁汁~ /beautifulSoup");
    }
}

