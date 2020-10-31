package day13.array.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 10:20
 * 定义一个int[] 整数元素 逆序输出
 */
public class Test02 {
    public static void main(String[] args) {
        //静态初始化一个数组
        int [] arr = {1,3,4,5,6,7,8,9};
        //调用方法实现逆序输出
        pintReverse(arr);
    }

    private static void pintReverse(int[] arr) {
        //把前一半的元素与后一般的元素交换
        for (int i = 0; i < arr.length/ 2; i++) {
            //交换
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1 ] = t;
        }

        //遍历数组
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
