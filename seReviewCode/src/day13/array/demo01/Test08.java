package day13.array.demo01;

import static day13.array.demo01.Test01.printIntArray;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 11:34
 * 向数组中插入元素
 */
public class Test08 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};

        int i = 2 ;//要插入的位置
        int key = 222;// 要插入的数
        //创建一个更大的数组存放要插入元素后的数组
        array = insert(array, i, key);
        printIntArray(array);

    }

    public static int[] insert(int[] array, int i, int key) {
        //判断i是否合理
        if (i < 0 || i> array.length){
            System.out.println(i + "索引值不合理！！！");
            return array;
        }
        int [] biggerArray = new int[array.length+1];
        System.arraycopy(array,0,biggerArray,0,i);
        biggerArray[i] = key;
        System.arraycopy(array,i,biggerArray,i+1,array.length-i);
        return biggerArray;
    }
}
