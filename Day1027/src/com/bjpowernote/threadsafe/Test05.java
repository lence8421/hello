package com.bjpowernote.threadsafe;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/27 14:51
 */
public class Test05 {
    public static void main(String[] args) {
        Test05 obj = new Test05();
        new Thread(new Runnable() {
            @Override
            public void run() {
               obj.sm();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
               obj.sm();
            }
        }).start();


    }
    public  void sm(){
//        synchronized (OJB) {      //经常定义一个常量对象作为锁对象
//        synchronized (Test05.class) {        //也经常使用当前类的字节码作为锁对象
        synchronized (this){        //在实例方法中的同步代码块也经常使用this当前对象作为锁对象
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " --- " + i );
            }
        }
    }
}
