package day13.array.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 10:11
 * 数组是引用数据类型，可以作为方法返回值， 可以作为方法的参数；
 */
public class Test01 {
    public static void main(String[] args) {
        int [] array = getArray(50);

        printIntArray(array);
    }

    public static void printIntArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    private static int[] getArray(int i) {
        int [] data = new int[i];
        for (int j = 0; j < data.length; j++) {
            data[j] = (int) (Math.random()*100);
        }
        return data;
    }
}
