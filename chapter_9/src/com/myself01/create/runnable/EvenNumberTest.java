package com.myself01.create.runnable;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/30 14:04
 */
public class EvenNumberTest implements Runnable {
    int i = 100;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " "+ i);
                this.i--;
            }
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        EvenNumberTest e1 = new EvenNumberTest();
        Thread T1 = new Thread(e1);
        Thread t2 = new Thread(e1);
        T1.start();
        t2.start();

    }
}

//class EvenNumber {
//    public static void main(String[] args) {
//         EvenNumberTest e1 = new EvenNumberTest();
//         new Thread(e1).start();
//
//        new Thread(new EvenNumberTest() {
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println(Thread.currentThread().getName() + "  "+ i);
//                    }
//                }
//            }
//        }).start();
//
//
//    }
//
//}