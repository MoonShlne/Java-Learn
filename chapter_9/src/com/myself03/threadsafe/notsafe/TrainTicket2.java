package com.myself03.threadsafe.notsafe;

import javax.lang.model.util.ElementScanner6;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/1 14:31
 */
public class TrainTicket2 implements Runnable {
    int ticketNum = 1000;
    boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {
        if (ticketNum > 0) {
//            try {
//                Thread.sleep(1);
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            ticketNum--;

            System.out.println(Thread.currentThread().getName() + "出售一张票,还剩" + ticketNum + "张");
        } else {
            isFlag = false;
        }
    }


}


class trainTicket2Test {
    public static void main(String[] args) {
//        公用属性
        TrainTicket2 t = new TrainTicket2();
        Thread t1 = new Thread(t, "线程1");
        Thread t2 = new Thread(t, "线程2");
        Thread t3 = new Thread(t, "线程3");
        t1.start();
        t2.start();
        t3.start();
        //自用
//        TrainTicket2 t = new TrainTicket2();
//        TrainTicket2 t1 = new TrainTicket2();
//        TrainTicket2 t2 = new TrainTicket2();
//        Thread t3 = new Thread(t, "线程1");
//        Thread t4 = new Thread(t1, "线程2");
//        Thread t5 = new Thread(t2, "线程3");
//        t3.start();
//        t4.start();
//        t5.start();

    }
}


