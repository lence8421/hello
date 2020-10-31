package bjpwernode.threadmethod;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 15:46
 */
public class Test02 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println( currentThread);//返回[线程名称，线程优先级，线程分组名称]
        Subthread sub = new Subthread();
        sub.start();

    }
    static class Subthread extends Thread{
        @Override
        public void run() {
            System.out.println("在run方法体中当前线程----->" + currentThread());
        }
    }
}
