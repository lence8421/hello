package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 9:54
 * 二分法查找算法
 */
public class Test02 {
    public static void main(String[] args) {
        int[] s = {11,44,55,66,77,80,90,100};
        int key = 44;
        int from = 0;//查找起始的位置；
        int to = s.length-1;//查找结束索引值
        int mid = (from + to)/ 2; //查找的中间索引值；
        binarySeaach(s, key, from, to, mid);
        return;
    }

    public static int binarySeaach(int[] s, int key, int from, int to, int mid) {
        while (from < to){
            if (s[mid] == key){
                return mid;
            }else if(s[mid] > key){
                //查找范围缩小到左一半
                to = mid -1;
                mid = (from + to)/2;
            }else {
                //查找范围缩小的到右一半
                from = mid + 1;
                mid = (from + to)/2;
            }
        }
        return -1;
    }
}
