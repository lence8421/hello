package day13.array.demo01;

import static day13.array.demo01.Test01.printIntArray;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 11:27
 * 数组的扩容
 */
public class Test06 {
    public static void main(String[] args) {
        int [] month = {1,2,3,4,5,6,7,8,9};
        month = copy(month);
        printIntArray(month);
    }

    public static int[] copy(int[] month) {
        //定义更大的数组，并赋值到大数组中
        int [] bigger = new int[month.length*2];
        System.arraycopy(month,0,bigger,0,month.length);
        return bigger;
    }
}
