package com.myself05.exer.exer4;

import com.myslef04._throw.UnderZeroException;

import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/25 19:20
 */
public class DivisionDemo {
    public  void  chu() throws UnderZeroException {
        Scanner scanner =new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt(); 
        if (x<0 || y <0){
            throw new UnderZeroException();
        }
        else {
            System.out.println(x/y);
        }

    }
}
