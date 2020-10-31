package com.bjpowernote.array.demo05;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 15:08
 */
public class Array01 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        arr [0] = 1;
        arr [1] = 11;
        arr [2] = 12;
        arr [3] = 13;
        arr [4] = 15;
        arr [5] = 16;
        arr [6] = 19;
        arr [7] = 19;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }
}
