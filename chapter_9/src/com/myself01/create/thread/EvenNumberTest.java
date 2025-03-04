package com.myself01.create.thread;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/29 16:16
 * 1.2 例题：创建一个分线程1，用于遍历100以内的偶数
 * 继承
 */
public class EvenNumberTest {
    public static void main(String[] args) {
       new  Thread( new Runnable() {
             public void run() {
                 for (int i = 1; i <= 100; i++) {
                     if (i % 2 == 0) {
                         System.out.println(Thread.currentThread().getName() + ":" + i);
                     }
                 }
             }
         }).start();
        new  Thread( new Runnable() {
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();



//        new Thread() {
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println(Thread.currentThread().getName() + ":"+ i);
//                    }
//                }
//            }
//        }.start();
//
//        new Thread(){
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    if (i % 2 == 1) {
//                        System.out.println(Thread.currentThread().getName() + ":"+ i);
//                    }
//                }
//            }
//        }.start();
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(Thread.currentThread().getName() + ":" +i);
//            }
//
//        }
//

    }

//class PrintNumber extends Thread {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 10000; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//
//        }
//    }


}
