package com.myself04.compare.comparable;

import com.myself04.compare.Product;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author polar
 *
 * @version 1.0
 * @since 2024/12/20 13:28
 */
public class ComparableTest {
    @Test
    public void test(){
    String[] strings = new String[]{"斯内克","克劳德","卡姆皮哟忒"};
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
    @Test
    public void test2(){
        Product[] products = new Product[3];
        for (int i = 0; i < products.length; i++) {
            products[i]= new Product( );
        }
        products[0].setName("LENOVO XIAOXIN");
        products[0].setPrice(5999);
        products[1].setName("KEYBOARD");
        products[1].setPrice(200);
        products[2].setName("IPHONE");
        products[2].setPrice(19999);

        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
    @Test
    public void test3(){
        Product p1 = new Product("aa",12443);
        Product p2 = new Product("ba",1241243);
        System.out.println(p1.compareTo(p2));
    }
}
