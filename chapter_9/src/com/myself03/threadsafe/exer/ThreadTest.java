package com.myself03.threadsafe.exer;

import java.util.Currency;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/4 15:06
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        new Thread(t1, "线程1").start();
        new Thread(t1, "线程2").start();

    }
}

class ThreadDemo implements Runnable {
    int time = 3;
    double count = 0;

    @Override
    public void run() {
        while (true) {
            if (time != 0) {
                count += 1000;
                time--;
                System.out.println(Thread.currentThread().getName() + "存款成功余额为" + count+"time:" + time);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
    }
}
