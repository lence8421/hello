package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 14:42
 */
public class Test05 {
    public static void main(String[] args) {
        int [][] arr = {{12,3,4},{12,3,4},{545,45,45,4,5,45},{23,32,4,5},{323,4,4343,4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
