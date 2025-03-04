package com.myself02.method_lifecycle;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/30 16:00
 * 1.join
 * 2.yield
 * 3.sleep
 * getPriority/set
 */
public class MethodTest {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.setName("支线");
        t1.setPriority(10);
        t1.start();

        Thread.currentThread().setName("主线");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }

    }
}


class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + i);
            }
            if (i ==20 ){
                try {
                    join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}