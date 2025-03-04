package com.myself04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/19 21:35
 * 定义方法如下：public static List duplicateList(List list)
 * 要求：① 参数List中只存放Integer的对象
 * ② 在List内去除重复数字值，尽量简单
 */
public class Exer1 {
    public static List duplicateList(List list) {
//        HashSet hashSet = new HashSet();
//        for(Object o: list){
//            hashSet.add(o);
//        }
//
//        ArrayList arrayList = new ArrayList();
//        for (Object o : hashSet){
//            arrayList.add(o);
//        }
//        return arrayList;
//
//        HashSet hashSet = new HashSet(list);
//        ArrayList arrayList = new ArrayList(hashSet);
//        return arrayList;

        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        return arrayList;


    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(7);

        for (Object o : duplicateList(arrayList)) {
            System.out.println(o);
        }

    }
}
