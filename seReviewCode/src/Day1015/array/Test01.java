package Day1015.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 20:09
 * 演示选择排序
 */
public class Test01 {
    public static void main(String[] args) {
        int [] data = {12,3,4,65,76,45,565,56565};
        //选择排序(由小到大),是从当前数据中选择最小的交换到前面

        for (int i = 0; i < data.length-1; i++) {//外层循环控制比较的轮次
            int min = i;//假定一个最小元素下标为0
            for (int j = min + 1; j < data.length; j++) {
                //内层循环控制每一轮比较的数据
                    if (data[j] < data[min]){
                        min = j;
                    }
            }
            //这个时候 data[mim] 是最小元素
            if (min != i){
                //两个元素做交换
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
            }

        }

        for (int x : data) {
            System.out.print(x + " ");
        }
    }
}
