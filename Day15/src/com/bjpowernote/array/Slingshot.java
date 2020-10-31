package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 11:38
 * 定义弹弓类
 */
public class Slingshot {
    public void shot(Brid brid){
        System.out.println("弹弓把鸟弹出去，鸟正在飞！！！");
        brid.motion();
    }
}
