package com.bjpowernote.array.demo03;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 11:34
 */
public class Test {
    public static void main(String[] args) {
        Fly brid = new RedBrid();
        brid.motion();

        brid = new YellowBrid();
        brid.motion();

        brid = new BlueBrid();
        brid.motion();

        brid = new BlackBrid();
        brid.motion();
    }
}
