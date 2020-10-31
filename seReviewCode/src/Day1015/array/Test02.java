package Day1015.array;

import java.util.Date;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 20:40
 */
public class Test02 {
    public static void main(String[] args) {

        int [] ss = {121,12,3,434,5,677,56,767,5645,434};
        //二分查找前提是数组由小到大排序
        //先进行排序， 用1.冒泡2.选择
                //从前向后进行两两比较,如果前面的数大于(小于)后面的数就交换.
            for (int i = 0; i < ss.length - 1; i++) {
                for (int j = 0; j < ss.length-1-i; j++) {
                    if (ss[j] > ss[j+1]){
                        int temp = ss[j];
                        ss[j] = ss[ j+ 1];
                        ss[j + 1] = temp;
                    }
                }
            }
            for (int s : ss) {
                System.out.print(s + " ");
            }
        System.out.println();
                //从当前的数中选择最小(最大)的交换到前面
               /* for (int i = 0; i < ss.length - 1; i++) {
                    int min = i;
                    for (int j = min + 1; j < ss.length; j++) {
                        if (ss[j] < ss[min]){
                            min = j;
                        }
                    }
                    if (i != min){
                        int temp = ss[i];
                        ss[i] = ss[min];
                        ss[min] = temp;
                    }
                }*/
                for (int s : ss) {
                    System.out.print(s + " ");
                }
              //  break;

  //      }
    }
}
