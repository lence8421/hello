package com.bjpowernote.array.demo05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 15:16
 */
public class Array02 {
    public static void main(String[] args) {
        //定义存储20给小数的数组
        double[] arr = new double[20];

        //从键盘获取20个小数存放到数组中；
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("请输入第" + (i+1) + "数：" );
            arr[i] = input.nextDouble();
        }

        //数组的遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("---------------");
        //加强版
        for (double x:arr
             ) {
            System.out.println(x);
        }
        //数组的拷贝
        double [] a = Arrays.copyOf(arr,2*arr.length);

        System.out.println("--------------------------");

        for (double x:a
             ) {
            System.out.println(x);
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
