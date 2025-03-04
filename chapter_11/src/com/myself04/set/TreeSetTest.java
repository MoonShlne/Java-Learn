package com.myself04.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/19 20:39
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof  Person && o2 instanceof  Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    int compare =  p1.getName().compareTo(p2.getName());
                    if (compare!= 0){
                        return  compare;
                    }
                    return (p1.getAge() -p2.getAge());
                }
                throw new RuntimeException();
            }
        };

        TreeSet treeSet = new TreeSet(comparator);
        Person p1 = new Person("a", 11);
        Person p2 = new Person("b", 11);
        Person p3 = new Person("a", 13);
        Person p4 = new Person("d", 14);
        Person p5 = new Person("s", 15);

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
