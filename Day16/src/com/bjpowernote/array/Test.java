package com.bjpowernote.array;



/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 11:01
 */
public class Test {
    public static void main(String[] args) {
        //静态初始化数组
        int [] arr = {1,2,3,4,5,6,7};
        //调用方法逆序输出数组元素
        reversr(arr);

        //定义方法，把int[]
        String s = joints(arr);
        System.out.println(s);


    }
    public static String joints(int [] arr){
        String s = "{";
        for (int i = 0; i <arr.length ; i++) {
            s += arr[i];
        }
        return s += "}";
    }
    private static void reversr(int[] arr) {
       /* for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }*/
        for (int i = 0; i < arr.length/ 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
