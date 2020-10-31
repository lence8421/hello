package day13.array.demo01;

import static day13.array.demo01.Test01.printIntArray;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 11:53
 * 冒泡排序
 */
public class Test10 {
    public static void main(String[] args) {
        int [] data = {3,4,5,67,8,399,9,45};
        printIntArray(data);

        //用冒泡排序 实现有小到大；8 个数 进行7轮
        for(int i =0 ; i < data.length-1 ; i++) {

            for(int j=0 ; j < data.length-1-i ; j++) {

                if(data[j] > data[j+1]) {
                    int temp = data[j];

                    data[j] = data[j+1];

                   data[j+1] = temp;
                }
            }
        }
        System.out.println();
        printIntArray(data);
    }
}
