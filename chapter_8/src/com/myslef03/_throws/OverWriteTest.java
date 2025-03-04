package com.myslef03._throws;

import java.io.IOException;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/25 16:11
 */
public class OverWriteTest {
    public static void main(String[] args) {
        Father f1 = new Son();
        try {
            f1.s();
        } catch (IOException e) {
            e.getMessage();
        }
    }


}

class Father {
    public void s() throws IOException {

        System.out.println(1);
    }
}

class Son extends Father {
    @Override
    public void s()   {
        System.out.println(2);
    }


}
