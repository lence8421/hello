package day12.angrybirds.slingshot2;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 21:24
 */
public interface Brid {//把各种颜色的鸟定义为接口，
    //接口是对功能的封装
    //接口内只能写，1.抽象方法 2 静态常量（默认有public static final） 3.静态啊方法 4 ，public default 修饰的方法；
    int a = 10;
     static void sum(int a ,int b){
        int sum = a + b;
    }
    default void ssdsdf(){}
    void fly();
}

class BrdBrig implements Brid{
    @Override
    public void fly() {
        System.out.println("红鸟正常飞行！！！");
    }
}

class BlueBrid implements Brid{
    @Override
    public void fly() {
        System.out.println("蓝冰可以裂变成三个！！！");
    }
}

class BlaclBrid implements Brid{
    @Override
    public void fly() {
        System.out.println("黑球会爆炸");
    }
}

class YellowBrid implements Brid{
    @Override
    public void fly() {
        System.out.println("黄风可以加速");
    }
}