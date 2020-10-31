package com.bjpowernote.array.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 10:52
 */
public class Test {
    public static void main(String[] args) {
        int [] array = getArray(50);
        //调用printIntArray（int [] array） 打印数组中的所有元素
        printIntArray(array);
    }

    private static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static int[] getArray(int capacity) {
        int [] data = new int[capacity];

        for (int i = 0; i <data.length ; i++) {
            data[i] = (int) (Math.random()*100);
        }

        return data;
    }
}
