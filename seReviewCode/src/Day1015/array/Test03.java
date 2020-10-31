package Day1015.array;

import java.util.Arrays;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 21:18
 * Arrays 工具类的几个常用方法
 */
public class Test03 {
    public static void main(String[] args) {
        //定义数组
        int [] data = {34,54,665,54,5,3434,34};
        //1.数组元素连接成字符串，并打印输出
        String str = Arrays.toString(data);
        System.out.println(str);
        //2.数组的扩容，返回新的数组
        int [] bigger = Arrays.copyOf(data,data.length*2);
        //3.对数组元素的排序
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        //4.二分法查找
        System.out.println(Arrays.binarySearch(data,22));
    }
}
