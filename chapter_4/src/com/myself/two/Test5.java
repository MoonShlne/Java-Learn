package com.myself.two;

import java.security.PublicKey;
import java.util.Arrays;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/18 14:43
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr2={1,2,3,4,5,6,7};
        int[] newArray=new int[arr2.length-1];
        int index=1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]!=5){
             newArray[i]=arr2[i];
            }
            else {
                index =i;
                break;
            }

        }

        for (int i = index+1; i < arr2.length ; i++) {

            newArray[i-1]=arr2[i];
        }


        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }



    }
}
