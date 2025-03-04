package com.myself.two;

import javax.xml.transform.Source;
import java.util.Random;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/15 19:21
 */
public class Test2 {
   public static void main(String[] args) {
        int[] arr1=new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= (int)(Math.random()*(90)+1);
            System.out.println(arr1[i]);
            }


        int max=arr1[0];
        int min=arr1[0];
        int sum=0;

       for (int i = 0; i < arr1.length; i++) {
        max=(arr1[i]>max)? arr1[i]:max;
        min=(arr1[i]>min)? min:arr1[i];
        sum+=arr1[i];

       }
        float avg= (float)(sum /arr1.length);
       System.out.println(max);
       System.out.println(min);
       System.out.println(sum);
       System.out.println(avg);
   }

    }
