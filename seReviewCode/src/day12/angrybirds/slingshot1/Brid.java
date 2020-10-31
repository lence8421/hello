package day12.angrybirds.slingshot1;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 20:43
 */
public abstract class Brid {//把各种颜色的鸟 抽象为鸟类
    //鸟的行为
    public abstract void behavior();
}

class RedBrid extends Brid{
    @Override
    public void behavior() {
        System.out.println("红鸟正常飞行");
    }
}

class BlueBrid extends Brid{
    @Override
    public void behavior() {
        System.out.println("蓝冰可以裂变成三个");
    }
}

class YellowBrid extends Brid{
    @Override
    public void behavior() {
        System.out.println("黄风会加速");
    }
}

class BlackBrid extends Brid{
    @Override
    public void behavior() {
        System.out.println("黑球会爆炸");
    }
}