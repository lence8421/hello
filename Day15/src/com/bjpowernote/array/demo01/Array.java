package com.bjpowernote.array.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/11 19:35
 */
public class Array {
    public static void main(String[] args) {
        int[] a1 = {1,232,23,5,6,7,8};
        int[] a = new int [12];

        System.out.println("数组中元素的个数：" + a1.length);
//读取元素
        System.out.println(a1[0]);
        //遍历数组
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        //逆序输出
        for (int i = a1.length - 1; i >= 0 ; i--) {
            System.out.println(a1[i]);

        }
        System.out.println(args);
        String[] strs = {};
        printLength(strs);
    }

    private static void printLength(String[] args) {
        System.out.println(args.length);
    }
}
