package com.myself05.map;

import com.myself01.collection.Person;

import java.util.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/20 19:31
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("aa",11);
        hashMap.put("aa",12);
        hashMap.put("zzx",11);
        hashMap.put("啊哈哈",1341);
        hashMap.put("dd",11);
        hashMap.put(new Person("aa",12),53);






//        System.out.println(hashMap);

//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//        System.out.println(hashMap.entrySet());
//        System.out.println(hashMap.keySet().size());
//        System.out.println(hashMap.get("aa"));
        //遍历
        Set set = hashMap.keySet();
        for (Object o:set){
            System.out.println(o);
        }
        Collection values = hashMap.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set set1 = hashMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Map.Entry entry = (Map.Entry)  iterator1.next();
            System.out.println(entry.getKey() + "---------------->" + entry.getValue());
        }
    }
}
