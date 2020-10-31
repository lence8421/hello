package day13.array.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 11:13
 * 可变长参数
 */
public class Test05 {
    public static void main(String[] args) {
        //调用方法可以传任意个参数
        int a = 100;
        可以传任意个参数的方法(a);
        可以传任意个参数的方法(10,20);
        可以传任意个参数的方法(a,12);
        可以传任意个参数的方法(a,12,3);
    }

    private static void 可以传任意个参数的方法(int...data) {
        //在方法体中可以把变长参数当作 数组使用
        int sum = 0;
        for (int i = 0; i < data.length ; i++) {
            sum += data[i];
        }
        System.out.println("sum = " + sum);
    }
}
