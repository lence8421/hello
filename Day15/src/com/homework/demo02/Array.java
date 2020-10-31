package com.homework.demo02;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 17:41
 * 定义存储10个整数的数组， 找出数组最大元素， 及最小元素的索引值
 */
public class Array {
    public static void main(String[] args) {
        //1）定义一个存储10个整数的数组
        int [] arr = {111,2,34,5,6,7,8,9,45,545};

        //找最大的元素
        int max;//定义一个变量存放最大值；
        max = arr[0];//假设arr[0]最大作比较

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("arr数组中最大的元素：" + max);

        //找最小元素索引
        int min = 0;
        for (int i = min + 1; i < arr.length ; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        System.out.println("数组元素中最小值的下标为：" + min);
    }

  /*  private static int getMax(int[] arr) {
        int i;
        for ( i = 0; i < arr.length ; i++){
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, i+1);
                }
            }

        }
        return arr[i];
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }*/
}
