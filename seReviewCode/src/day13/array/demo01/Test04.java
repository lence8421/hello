package day13.array.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 11:21
 * 定义方法,把int[]数组元素连接一个字符串返回
 */
public class Test04 {
    public static void main(String[] args) {
        int [] array = {4,5,6,7,8,9};
        //调用连接方法 待返回值
        String sc = getArrayJoint(array);
        System.out.println(sc);
    }

    private static String getArrayJoint(int[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }
}
