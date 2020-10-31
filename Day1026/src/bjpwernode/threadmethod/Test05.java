package bjpwernode.threadmethod;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 16:05
 * getPriority() 返回此线程的优先级
 * setPriority(int newPriority) 更改此线程的优先级。
 */
public class Test05 {
    public static void main(String[] args) {
        

        for (int i = 0; i < 100; i++) {
            System.out.println("mian------>" + Thread.currentThread().getPriority() + " == " + i);
        }
    }
}
