package com.bjpowernode.ticket;

import java.util.Random;

/**
 * 模拟多窗口售票
 */
public class Test02 {
    public static void main(String[] args) {
        //创建车票
        Ticket ticket = new Ticket();

        //开启10个窗口售票
        for (int i = 0; i < 10; i++) {
            new WindowThread("窗口--" + i, ticket).start();
        }
    }
}

//定义窗口类,窗口可以同时售票, 定义为线程类
class WindowThread extends Thread{
    //出售哪一车的车票
    private Ticket ticket;
    //通过构造方法初始化
    public WindowThread(String name, Ticket ticket) {
        super(name);        //线程名称
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            synchronized ( ticket ) {
                //如果没有余票就结束
                if ( !ticket.hasRemaining()){
                    System.out.println("票已卖完");
                    return;
                }
                ticket.print();     //打印车票
            }
        }
    }
}

//定义车票类
class Ticket{
    private  int no ;   //票号
    private static final int MAX = 130;     //最大容量

    //判断是否还有余票
    public boolean hasRemaining(){
        return  no < MAX;
    }

    //打印车票
    public void print(){
        System.out.println(Thread.currentThread().getName() + "出售车票--" + no );
        try {
            Thread.sleep(new Random().nextInt(2));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        no++;
    }
}
