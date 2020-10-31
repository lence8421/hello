package com.bjpowernode.watit;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/29 11:10
 */
public class Test01 {
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + "--------" + i);
                    if (i == 100){
                        System.out.println(Thread.currentThread().getName() + "将要进入等待状态");
                        synchronized (OBJ) {
                            try {
                                OBJ.wait();//线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"t1");
        t1.start();

        //当前线程
        for (int i = 0; i < 10; i++) {
            System.out.println("main == " + i + " == " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main线程执行完for循环后，把他t1等待的线程唤醒");
        synchronized (OBJ) {
            OBJ.notify();
        }
    }
}
