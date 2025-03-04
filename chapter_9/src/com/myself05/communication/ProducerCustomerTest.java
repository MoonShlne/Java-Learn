package com.myself05.communication;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/7 13:14
 * 案例2：生产者&消费者
 * 生产者(Producer)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品。
 */
public class ProducerCustomerTest {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        Producer p1 = new Producer(c);
        Customer c1 = new Customer(c);


        Thread t1 = new Thread(p1, "生产者一号");
        Thread t2 = new Thread(c1, "消费者一号");
        t2.setPriority(10);
        t1.start();
        t2.start();
//        Thread t3 = new Thread(p1, "生产者二号");


    }
}

class Clerk {
    private int productNum = 0;
    public synchronized void addProduct() {
        if (productNum < 20) {

//                System.out.println("开始生产");
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产成功,目前件数为" + productNum);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

    public synchronized void minusProduct() {
        if (productNum > 0) {

//                System.out.println("开始消费");
            productNum--;
            System.out.println(Thread.currentThread().getName() + "消费成功,目前件数为" + productNum);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}


class Producer implements Runnable {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public  void run() {

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.addProduct();
        }
    }
}


class Customer implements Runnable {
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public  void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.minusProduct();
        }
    }
}