package com.myself01.throwable;


import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 10:39
 */
public class ExceptionTest {
@Test
public void test(){
int[] a =new int[1];
    System.out.println(a[1]);
}

@Test
public void test2(){
String a =null;
    System.out.println(a.toString());
}

@Test
public void test3(){
Object object = new Object();
    Date date = (Date) object;
}


@Test
public void test4(){
String string = new String("aa");
Integer b =  Integer.parseInt(string);
}

@Test
public void test5(){
    Scanner scanner =new Scanner(System.in);
    int i = scanner.nextInt();

}

@Test
public void test6(){
int a =1/0;
}
}
