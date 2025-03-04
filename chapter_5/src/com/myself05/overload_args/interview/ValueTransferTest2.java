package com.myself05.overload_args.interview;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/3 13:49
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
   Data data =new Data();
   data.m=10;
   data.n=20;

data.trans(data);

        System.out.println(data.m +"  "+ data.n);


    }
}
class Data{
    int m;
    int n;
    public void trans(Data data){
        int temp =data.m;
        data.m=data.n;
        data.n=temp;
    }

}
