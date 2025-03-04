package com.myself02.iterator;

import com.myself01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/16 16:00
 */
public class IteratorTest {
    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add("a");
        collection.add(2);
        collection.add(1.2);
        collection.add(new Person("防溺水",44));
        System.out.println(collection);


        Iterator iterator = collection.iterator();
//        System.out.println(iterator.getClass());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());


    }
}
