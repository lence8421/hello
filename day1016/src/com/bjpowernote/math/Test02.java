package com.bjpowernote.math;

import java.util.Random;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 16:31
 */
public class Test02 {
    public static void main(String[] args) {
        //1）先创建Random对象
        Random random = new Random();

        //2）生成随机数[1,0)
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble());
        }

        //3)随机整数[-2147483648,21473647]
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        //4)nextInt(limit)生成[0,limit)范围内的随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }
        //5)可以指定随机数的种子，相同的种子random对象，生成的随机数序列是一样的
        Random random1 = new Random(123456);
        for (int i = 0; i < 10; i++) {
            System.out.println(random1.nextDouble());
        }
        System.out.println("-----------------------");
        Random random2 = new Random(123456);
        for (int i = 0; i < 10; i++) {
            System.out.println(random2.nextDouble());
        }
    }
}
