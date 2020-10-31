package com.bjpowernode.watit;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/29 11:51
 */
public class Test02 {
    private static final Object OBJ = new Object();
    private static int num = 0;

    public static void main(String[] args) {
        //创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //当要打印奇数的时候等待
                synchronized (OBJ) {
                    for (int i = 0; i < 100; i++) {
                        while (num % 2 != 0) {
                            try {
                                OBJ.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "\t" + num++);
                        //通知另一个线程打印
                        synchronized (OBJ) {
                            OBJ.notify();
                        }
                    }
                }
            }

        }, "Thread-0").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (OBJ) {
                    for (int i = 0; i < 100; i++) {
                        while (num % 2 != 1) {
                            try {
                                OBJ.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName() + "\t" + num++);
                        //通知另一个线程打印
                        synchronized (OBJ) {
                            OBJ.notify();
                        }
                    }
                }
            }

        }, "Thread-1").start();

    }
}
