package bjpwernode.createthread;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 11:56
 * 创建线程的方式一
 * Java创建线程依赖java.lang.Thread类
 * 定义Thread类子类
 */
public class Test01 {
    public static void main(String[] args) {
        //3)创建线程对象
        Thread t = new SubThread();
        SubThread x = new SubThread();
        //4)开启线程
        x.start();//只能启动一次
        // t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main 线程执行了" + i);
        }
    }
}
//1）定义Thread类 的子类
class SubThread extends Thread{
    @Override
    //2）重写run 方法
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread类的子类线程执行了" + i);
        }
    }
}