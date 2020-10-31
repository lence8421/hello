package com.bjpowernode.ticket;

import java.util.Random;

/**
 * 模拟多个窗口出售同一车的车票
 * 多个窗口同时售票,可以使用线程模拟
 * 票就是多个线程共享的数据
 */
public class Test01 {

    //定义静态变量记录票的座位号
    static int no = 1;

    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        //定义卖票的Runnable任务
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (OBJ) {
                        if (no > 130) {
                            System.out.println("票已卖完");
                            return;
                        }
                        System.out.println(Thread.currentThread().getName() + " 出售车票-" + no);
                        no++;
                    }
                    //通过线程睡眠模拟打印车票需要的时间
                    try {
                        Thread.sleep(new Random().nextInt(5));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //开启10个线程,都执行r卖票任务
        for (int i = 0; i < 10; i++) {
            new Thread(r, "窗口--" + i).start();
        }
    }
}
