package com.bjpowernote.threadsafe;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/27 12:15
 */
public class Test02 {
    static  int  num = 0;
    private static final Object OBJ =new Object();
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    synchronized ( OBJ ){
                        num ++;
                    }
                }
            }
        };

        Thread t1 = new Thread(r,"t1");
        Thread t2 = new Thread(r,"t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(num);

    }
}
