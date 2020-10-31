package Day1019.homeword.demo02;

import java.util.Random;
import java.util.TreeSet;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 9:24
 */
public class Test02 {
    public static void main(String[] args) {
        //1
        Random random = new Random();

        //2
        TreeSet<Integer> redBall = new TreeSet<>();
        //向集合中添加随机整数
        while (redBall.size() < 6){
            redBall.add(random.nextInt(33) + 1);
        }

        //3
        int blueBall = random.nextInt(16) + 1;
        //
        System.out.println("红色球" + redBall + "蓝色球" + blueBall);
    }
}
