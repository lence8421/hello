package com.homework.demo02;

import java.util.Arrays;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 19:59
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,34,5,6,7,8,9,45,545};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                if (array[i] > array[j]) {//相反顺序只需改变大于号
                    swap(array,i,j); // 两个数交换位置
                }
            }
        }
        //System.out.println(array[array.length-1]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}