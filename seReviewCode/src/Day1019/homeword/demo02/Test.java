package Day1019.homeword.demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 19:25
 * 2: 请随机生成一注双色球号码。双色球投注区分为红色球号码区和蓝色球号码区，红色球号码区由1-33共三十三个号码组成，蓝色球号码区由1-16共十六个号码组成。投注时选择6个红色球号码和1个蓝色球号码组成一注进行单式投注.（要求同色号码不重复）
 */
public class Test {
    public static void main(String[] args) {
        Ball[] redBalls = new RedBall[33];
        Ball[] blueBalls = new BlueBall[16];
        List<Ball> ballList = new ArrayList<>();

        int size = 0;
        for (int i = 0; i < redBalls.length; i++) {
            size++;
            redBalls[i] = new RedBall("红色",size);
        }
        size = 0;
        for (int i = 0; i < blueBalls.length; i++) {
            size++;
            blueBalls[i] = new BlueBall("蓝色",size);
        }
        List<Ball> xxx = Arrays.asList(redBalls);
        List<Ball> yyy = Arrays.asList(blueBalls);
        ballList.addAll(xxx);
        ballList.addAll(yyy);
        for (Ball ball : ballList) {
            System.out.println(ball);
        }
        Random random = new Random();
        List<Ball> betting = new ArrayList<>();
        while (betting.size() != 7 ){
            betting.add(ballList.get(random.nextInt(ballList.size())));
        }
        System.out.println("----------------");
        for (Ball ball : betting) {
            System.out.println(ball);
        }
    }
}
abstract class  Ball{
    String color;
    int num;

    public Ball() {
    }

    public Ball(String color, int num) {
        this.color = color;
        this.num = num;
    }
}
class RedBall extends Ball{
    public RedBall() {
    }

    public RedBall(String color, int num) {
        super(color, num);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", num=" + num +
                '}';

    }
}
class BlueBall extends Ball{
    public BlueBall() {
    }

    public BlueBall(String color, int num) {
        super(color, num);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", num=" + num +
                '}';
    }
}