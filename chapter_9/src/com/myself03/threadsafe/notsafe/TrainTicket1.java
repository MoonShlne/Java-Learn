package com.myself03.threadsafe.notsafe;

import javax.naming.Name;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/1 14:20
 * <p>
 * <p>
 * 例题：开启三个窗口售票，总票数为100张。
 * <p>
 * 分别使用两种方式实现
 */
public class TrainTicket1 extends Thread {
    public static int ticketNum = 100;
    static Object o1 = new Object();
    @Override
    public void run() {
        int saleNmu = 0;
        while (true) {
            synchronized (TrainTicket1.class) {  //不能用this ，因为有三个对象
                if (ticketNum > 0) {

                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticketNum--;
                    saleNmu++;
                    System.out.println(getName() + "出售一张票,还剩" + ticketNum + "张");
                } else {
                    break;
                }
            }
                System.out.println(getName() + "一共卖了 " + saleNmu + "张");
        }
    }
}


class TrainTicketTest {
    public static void main(String[] args) {
        TrainTicket1 t1 = new TrainTicket1();
        t1.setPriority(10);
        t1.setName("线程1");
        TrainTicket1 t2 = new TrainTicket1();
        t2.setName("线程2");
        t2.setPriority(1);
        TrainTicket1 t3 = new TrainTicket1();
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
