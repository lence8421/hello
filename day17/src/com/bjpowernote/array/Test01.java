package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 9:20
 * 选着排序
 */
public class Test01 {
    public static void main(String[] args) {
        int [] arr = {21,34,45,6,11,45,405,66,88};
        //n个数 比较 n-1轮
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;//保存最小元素下标
            for (int j =  min+ 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){//交换
                    min = j ;//保存最小下标
                }
            }
            if (i != min){//判断
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
