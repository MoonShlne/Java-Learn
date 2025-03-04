package com.myself05.overload_args.interview;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/2 17:10
 */
public class ValueTransferTest {
    ValueTransferTest v1 =new ValueTransferTest();
    public static void main(String[] args) {
        int m = 20;
        int n = 10;
        System.out.println("m=" + m + ",n=" + n);

        ValueTransferTest v1 =new ValueTransferTest();
        v1.trans(m,n);
    }
    public void trans(int m, int n) {
        int temp = n;
        n = m;
        m = temp;
        System.out.println("m=" + m + ",n=" + n);
        ValueTransferTest v1 =new ValueTransferTest();

    }
}


