package day12.angrybirds.slingshot1;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 20:37
 *  模拟愤怒小鸟中的弹弓类
 */
public class Test {
    public static void main(String[] args) {

        Slingshort slingshort = new Slingshort();
        slingshort.catapult(new BlackBrid());
        Brid brid = new RedBrid();
        brid.behavior();
        //Slingshort.catapult(new BlueBrid());
        brid = new BlackBrid();
        brid.behavior();
        //Slingshort.catapult(new YellowBrid());
        slingshort.catapult(new Brid() {//匿名内部类
            @Override
            public void behavior() {
                System.out.println("黑球会爆炸");
            }
        });
    }
}
