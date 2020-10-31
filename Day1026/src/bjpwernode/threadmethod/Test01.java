package bjpwernode.threadmethod;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 15:21
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("11------------->" + Thread.activeCount());//有main线程 和 垃圾回收器

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("sub ----->" + i);
                }
            }
        });
        System.out.println("22------------>" + Thread.activeCount());
        System.out.println(t.isAlive());
        t.start();
        System.out.println("33------------>" + Thread.activeCount());
        System.out.println(t.isAlive());
    }
}
