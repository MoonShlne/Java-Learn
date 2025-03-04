package com.myself05.map.exer1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/20 20:44
 * 添加你喜欢的歌手以及你喜欢他唱过的歌曲,并遍历
 */
public class SongsNameTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("蔡徐坤","基尼太没");
        map.put("啊发生的"," 阿斯蒂芬");

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.println("歌手"+entry.getKey()+ "的歌曲:"+ entry.getValue() );
        }


    }
}
