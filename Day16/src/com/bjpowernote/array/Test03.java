package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 12:02
 */
public class Test03 {
    public static void main(String[] args) {
        sum(1);
        sum(1,2);
        sum(12,5);
        sum(4556,3);
    }
    //定义方法，计算任意个整数的和，方法参数可以定义为变长参数
    public static void sum(int x ,int...date){
        int sum = 0;
        for (int i = 0; i < date.length; i++) {
            sum += date[i];
        }
        sum += x;
        System.out.println("sum = " + sum);
    }
}
