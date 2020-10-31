package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 14:44
 */
public class Test04 {
    public static void main(String[] args) {
        int [] data = {21,323,45,656,75,65,756};

        int i = 3;
        int key = 111;

       // data = insert(data, i, key);
        print(data);

        print(del(data, i));
    }

    private static int[] del(int[] data, int i) {
        int [] bigger = new int[data.length+1];
        System.arraycopy(data,0,bigger,0,i);
        System.arraycopy(data,i+1,bigger,i,data.length-i-1);

        return bigger;
    }

    private static void print(int[] data) {
        for (int x : data) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    private static int[] insert(int[] array, int i, int key) {
        int [] bigger = new int[array.length + 1];
        System.arraycopy(array,0,bigger,0,i);

        bigger[i] = key;

        System.arraycopy(array,i,bigger,i+1, array.length-i);

        return bigger;
    }


}
