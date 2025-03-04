package com.myself03.list.exer2;

import java.util.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/17 14:08
 * <p>
 * 案例：
 * 定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 * <p>
 * (1) 创建集合，集合存放随机生成的30个小写字母
 * <p>
 * (2) 用listTest统计，a、b、c、x元素的出现次数
 */
public class ListTest {
    public static int listTest(Collection list, String s) {
        Iterator iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(s) ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
//            'a'-'z' --[97-122]

            arrayList.add((char) (Math.random() * (122 - 97 + 1) + 97) + "");

        }
        System.out.println(arrayList);
        System.out.println(listTest(  arrayList, "s"));
//        System.out.println("a:" + listTest(arrayList, "a"));
    }

}
