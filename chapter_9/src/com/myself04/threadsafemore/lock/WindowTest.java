package com.myself04.threadsafemore.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/6 14:30
 */
public class WindowTest {
    public static void main(String[] args) {
        Thread t1 = new Window();
        Thread t2 = new Window();

        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}


class Window extends Thread {
    public static int ticket = 100;
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {

            while (true) {
                lock.lock();
                if (ticket > 0) {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "卖出一张，票号为" + ticket--);
                } else {
                    break;
                }
            }
        } finally {
            lock.unlock();

        }

    }
}
