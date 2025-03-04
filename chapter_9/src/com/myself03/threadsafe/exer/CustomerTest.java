package com.myself03.threadsafe.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/4 15:22
 */
public class CustomerTest {
    public static void main(String[] args) {
        Account gatheringAccount = new Account();
        Customers c1 = new Customers(gatheringAccount);
        Customers c2 = new Customers(gatheringAccount);
        c1.setName("一号");
        c2.setName("二号");
        c1.start();
        c2.start();
    }
}

class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void addCount(int money) {
        balance += money;
        System.out.println(Thread.currentThread().getName() + "存款" + "1000元，余额" + getBalance() + "元");


    }
}

class Customers extends Thread {
    Account account;


    public Customers() {
    }

    public Customers(Account account) {
        this.account = account;
    }

    @Override
    public  void run() {

        for (int i = 0; i < 3; i++) {
            account.addCount(1000);
//            System.out.println(Thread.currentThread().getName() + "存款" + "1000元，余额" + account.getBalance() + "元");

        }
    }
}
