package com.myself03.threadsafe.runnablesafe;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/1 14:31
 */
public class TrainTicket2 implements Runnable {
    int ticketNum = 100;

    @Override
    public void run() {
        int count = 0;

        while (true) {
            synchronized (this) {
                if (ticketNum > 0) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticketNum--;
                    count++;
                    System.out.println(Thread.currentThread().getName() + "出售一张票,还剩" + ticketNum + "张");
                } else {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + "一共卖了" + count + "张");
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
