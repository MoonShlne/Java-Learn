package com.myself04.threadsafemore.singleton;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/6 13:16
 */
public class Bank {
    public static Bank b1;
    public static Bank b2;

    private static Bank bank = null;

    public synchronized static Bank getInstance() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (bank == null) {
            bank = new Bank();
        }
        return bank;
    }

}

class BankTest {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Bank.b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Bank.b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Bank.b1);
        System.out.println(Bank.b2);
        System.out.println(Bank.b1 == Bank.b2);

    }
}
