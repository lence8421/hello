package day13.array.demo01;

import static day13.array.demo01.Test01.printIntArray;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 10:29
 * 定义方法，实现int[]数组元素的乱序
 */
public class Test03 {
    public static void main(String[] args) {
        //静态初始化
        int [] year = {1,2,3,4,5,6,7,8,9,10,11,12};
        //调用方法实现乱序
        disorder(year);
        //调用方法打印输出
        printIntArray(year);
    }

    private static void disorder(int[] year) {
        //乱序数组下标 ，并交换
        for (int i = 0; i < year.length; i++) {
            int x = (int) (Math.random()*year.length);
            int t = year[i];
            year[i] = year[x];
            year[x] = t;
        }
    }
}
