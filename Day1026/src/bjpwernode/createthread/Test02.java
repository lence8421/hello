package bjpwernode.createthread;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 12:03
 * 创建线程的方式二
 * Java创建线程依赖java.lang.Thread类
 * 定义Runnable接口的实现类
 */
public class Test02 {
    public static void main(String[] args) {
        //3）创建线程对象
        Prime p = new Prime();
        Thread t = new Thread(p);
        //开启子线程
        t.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t2 thread----->" + i);
                }
            }
        });

        //开启子线程
        t2.start();

        //当前线程是main线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main-thread-->" + i);
        }
    }
}

//1) 定义一个 类  实现Runnable接口
class Prime implements Runnable{//Thread 是 Runnable 的一个实现类
    //2)重写run()方法, run()方法中的代码就是子线程要执行的代码
    @Override
    public void run() {
        // 在子线程中打印100行字符串
        for (int i = 1; i <= 100; i++) {
            System.out.println("sub thread -->" + i);
        }
    }

}