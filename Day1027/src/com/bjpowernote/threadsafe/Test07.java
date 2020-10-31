package com.bjpowernote.threadsafe;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/27 15:14
 */
public class Test07 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Test07().mm();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Test07.sm();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Test72.sm();
            }
        }).start();
    }
    public static void sm(){
        synchronized ( Test07.class){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() +"--------->"+ i);
            }
        }
    }
    public  void mm(){
        synchronized ( Test07.class){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() +"--------->"+ i);
            }
        }
    }
}
class Test72{
    public static void sm(){
        synchronized (Test07.class){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() +"--------->"+ i);
            }
        }
    }
}