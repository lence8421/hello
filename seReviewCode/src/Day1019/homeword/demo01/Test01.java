package Day1019.homeword.demo01;

import java.util.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 19:24
 *1 已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","123478933", "9876543", "67891", "123478933"}。将该数组里面的所有qq号都存放在List中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class Test01 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","123478933", "9876543", "67891", "123478933"};
        //1)定义一个存储QQ号的list集合
        List<String> qqlist1 = new ArrayList<>();

        // 遍历数组元素添加到list
        for (String qq : qqlist1) {
            if (!qqlist1.contains(qq)){
                qqlist1.add(qq);
            }
        }

       /* List<String> aslist = Arrays.asList(strs);
        Set<String> set = new HashSet<>(aslist);
        List<String> qqlist2 = new ArrayList<>(set);
        System.out.println(qqlist2);*/
        /*for (int i = 0; i <strs.length; i++) {
            if (strs[i] != null){
                list1.add(strs[i]);
            }
        }
        System.out.println(list1);
        Object[] objects = list1.toArray();
        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = i+1; j <list1.size() ; j++) {
                if (list1.get(i) == list1.get(j)){
                   list1.remove(j);
                }
            }
        }
*/
        for (Iterator<String> iterator = qqlist1.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.print(next + "\t");
        }
        System.out.println("\n---------------------------");
        for (String s : qqlist1) {
            System.out.print(s + "\t");
        }
    }
}

