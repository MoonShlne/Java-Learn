package com.myself03.threadsafe.threadsafe;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/1 14:20
 * 使用同步方法解决线程安全
 */
public class TrainTicket1 extends Thread {
    public static int ticketNum = 1000;
    static Object o1 = new Object();
    int saleNmu = 0;
    boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
        System.out.println(getName() + "一共卖了 " + saleNmu + "张");

    }

    public  void show() {
        synchronized (TrainTicket1.class) {
            if (ticketNum > 0) {
                try {
                    sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticketNum--;
                saleNmu++;
                System.out.println(getName() + "出售一张票,还剩" + ticketNum + "张");
            } else {
                isFlag = false;
            }
        }
    }

}


class TrainTicketTest {
    public static void main(String[] args) {
        TrainTicket1 t1 = new TrainTicket1();
//        t1.setPriority(10);
        t1.setName("线程1");
        TrainTicket1 t2 = new TrainTicket1();
        t2.setName("线程2");
//        t2.setPriority(1);
        TrainTicket1 t3 = new TrainTicket1();
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
