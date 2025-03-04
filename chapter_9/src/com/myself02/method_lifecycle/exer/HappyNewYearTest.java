package com.myself02.method_lifecycle.exer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/12/1 17:19
 * <p>
 * <p>
 * 新年倒计时
 * <p>
 * 模拟新年倒计时，每隔1秒输出一个数字，依次输出10,9,8......1，最后输出：新年快乐！
 */
public class HappyNewYearTest implements Runnable {

    int i = 10;
    boolean isPrint = false;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (i >= 1) {
                    System.out.println(Thread.currentThread().getName() + "   " + i);
                    i--;
                } else if (i == 0) {
                    if (!isPrint) {
                        System.out.println(Thread.currentThread().getName() + "Happy New Year");
                        isPrint = true;
                        break;
                    } else {
                        break;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

}

class HappyNewYear {
    public static void main(String[] args) {
        HappyNewYearTest h1 = new HappyNewYearTest();
        new Thread(h1, "线程1").start();
        new Thread(h1, "线程2").start();
    }
}
