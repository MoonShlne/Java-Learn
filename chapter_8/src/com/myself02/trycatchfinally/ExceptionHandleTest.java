package com.myself02.trycatchfinally;


import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 11:50
 */
public class ExceptionHandleTest {

    @Test
    public void test() {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("执行完成");
    }


}
