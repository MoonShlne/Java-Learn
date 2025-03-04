package com.myself.two;

/**
 * @author polar
 * @version 1.0
 * @since 2024/10/19 15:59
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[]  arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int target=5;
        int head=0;
        int end = arr.length-1;
        int count=0;
        while (head!=end){
            int mid=(head+end)/2;
            if (arr[mid]<target){
                head=mid+1;
                count++;


            }
            if (arr[mid]>target){
                end=mid-1;
                count++;


            }
            if (target==arr[mid]){
                System.out.println("找到targetl "+"indsex="+mid);
                count++;

                break;

            }
        }
        System.out.println(count);
    }

}
