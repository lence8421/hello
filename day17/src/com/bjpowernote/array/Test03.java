package com.bjpowernote.array;

import java.util.Arrays;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 10:36
 */
public class Test03 {
    public static void main(String[] args) {
        //定义数组
        int[] data = {23,4,5,565,888,7,12,86,20,867,6,76};
        //1）调用Arrays.toString()可以把数组元素连接成字符串（带返回）
        String xx = Arrays.toString(data);
        System.out.println(xx);
        /*String s = new String(String.valueOf(data));
        System.out.println(s);*/
        //2)调用Array.copyof(原数组，新数组的长度)进行复制，返回新的数组；
        int[] bigger = Arrays.copyOf(data,data.length*2);
        System.out.println(Arrays.toString(bigger));

        int[] smaller = Arrays.copyOf(data,data.length/2);
        System.out.println(Arrays.toString(smaller));

        //3)排序
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        //4）排序后二分查找
        System.out.println(Arrays.binarySearch(data,88));
        System.out.println(Arrays.binarySearch(data,28));
        System.out.println(Arrays.binarySearch(data,20));

    }
}
