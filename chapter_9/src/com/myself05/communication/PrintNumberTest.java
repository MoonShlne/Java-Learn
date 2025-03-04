package com.myself05.communication;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/6 15:28
 */
public class PrintNumberTest {
    public static void main(String[] args) {

        PrintNumber p1 = new PrintNumber();
        Thread t1 = new Thread(p1, "线程1");
        Thread t2 = new Thread(p1, "线程2");
//        Thread t3 = new Thread(p1, "线程1");
//        Thread t4 = new Thread(p1, "线程1");
//        Thread t5 = new Thread(p1, "线程1");
//        Thread t6 = new Thread(p1, "线程1");
//        Thread t7 = new Thread(p1, "线程1");
//
        t1.start();
        t2.start();

    }
}

class PrintNumber implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "   " + num++);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;
                }

            }
        }
    }
}
