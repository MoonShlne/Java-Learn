package com.myself01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/16 13:36
 */
public class CollectionTest {
    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add("a");
        collection.add(2);
        collection.add(1.2);
        collection.add(new Person("防溺水",44));
        System.out.println(collection);
        System.out.println(collection.size());

        Collection collection1 = new ArrayList();
        collection1.add(new  Person("a",3));
        collection1.add(21);

        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println(collection.size());

        collection1.clear();
        System.out.println(collection1);

        Object [] a = collection.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void test2(){
        int [] ints = new int[]{1,4,6,8,9} ;
        String [] strings = new String[]{"aa","bb","cc"};
        Collection list = Arrays.asList(ints,"aa");
        Collection list1 = Arrays.asList(strings);
        System.out.println(list);
        System.out.println(list1);
    }
}
