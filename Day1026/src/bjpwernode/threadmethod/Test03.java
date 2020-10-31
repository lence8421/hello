package bjpwernode.threadmethod;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 15:54
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("main id--->" + Thread.currentThread().getId());

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread() + "的ID：" +Thread.currentThread().getId());
                }
            }).start();
        }
    }
}
