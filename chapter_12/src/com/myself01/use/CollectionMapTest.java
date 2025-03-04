package com.myself01.use;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 尚硅谷-宋红康
 * @create 11:39
 */
public class CollectionMapTest {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<Integer>();

        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        objects.add(4);
        Iterator<Integer> iterator = objects.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getClass());
        }


    }
    //体会集合中使用泛型前的场景


    //在集合中使用泛型的例子


}
