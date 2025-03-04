package com.myself04.compare.comparator;

import com.myself04.compare.Product;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author polar
 * @version 1.0
 * @since 2025/1/12 13:37
 */
public class comparatorTest {


    @Test
    public void test(){
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
        //创建一个实习接口类的的对象

//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof  Product && o2 instanceof  Product){
//                    o1 = (Product) o1;
//                    o2 = (Product) o2;
//                   return  Double.compare(((Product) o1).getPrice(),((Product) o2).getPrice());
//                }
//                throw  new RuntimeException("类型不匹配");
//            }
//        };
            //lambda1
        Comparator<Product> comparator1 = ( o1, o2) ->Double.compare(o1.getPrice(),o2.getPrice());
        //lambda 2
//        Arrays.sort(products,( o1, o2) ->Double.compare(o1.getPrice(),o2.getPrice()));


        Arrays.sort(products,comparator1);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

}
