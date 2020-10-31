package bjpwernode.createthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 12:23
 * 创建线程的方式三
 * Java创建线程依赖java.lang.Thread类
 * 定义Callable接口的实现类
 */
public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3)创建线程对象
        Prime2 p2 = new Prime2();//创建Callable接口的实现类对象
        FutureTask<Integer> task = new FutureTask<>( p2);//创建FutureTask对象
//FutureTask类实现了RunnableFuture接口, 该接口继承了Runnable接口, FutureTask类就是Runnable接口的实现类
        Thread t3 = new Thread(task);
        //4）开启线程
        t3.start();

        //当前线程main 线程
        for (int i = 0; i < 100; i++) {
            System.out.println("mian ----->" + i);
        }
        //在main线程中可以获取子线程的返回值
        System.out.println("task resut :" + task.get() );
    }
}
//1)定义类实现Callable接口
//Callable接口的call()方法有返回值, 可以通过Callable接口泛型指定call()方法的返回值类型
class Prime2 implements Callable<Integer>{
    //2)重写call()方法, call()方法中的代码就是子线程要执行的代码
    @Override
    public Integer call() throws Exception {
        //累加1~100之间的整数和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
/*
    Callable接口与Runnable接口的区别：

 */
