package com.bjpowernode.dirtyread;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/29 10:23
 */
public class Test02 {
    public static void main(String[] args) {
        MyValue myValue = new MyValue("lisi","123");

        //创建一个线程设置myValue对象属性
        new Thread(new Runnable() {
            @Override
            public void run() {
                myValue.setData("wangwu","456");
            }
        },"t1").start();

        //创建一线程读取myValue
        new Thread(new Runnable() {
            @Override
            public void run() {
                myValue.getData();
            }
        },"t2").start();
    }
}
