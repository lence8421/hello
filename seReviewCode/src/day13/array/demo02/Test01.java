package day13.array.demo02;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 15:20
 * 定义存储10个整数的数组， 找出数组最大元素， 及最小元素的索引值
 */
public class Test01 {
    public static void main(String[] args) {
        int [] array = {12,30,40,5,6,32,54,86,234,56};

        //找数组中最大的元素
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

        //找数组中最小元素的索引
        int min = 0;
        for (int i = min + 1; i < array.length; i++) {
            if (array[i] < array[min]){
                min = i ;
            }
        }
        System.out.println("最小元素下标: " + min + ", 最小值:" + array[min]);
    }
}
