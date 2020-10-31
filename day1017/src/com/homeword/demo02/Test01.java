package com.homeword.demo02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 8:43
 * 2 分析以下需求，并用代码实现：
 * (1)	生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * (2)	遍历集合中的所有元素打印
 * (3) 判断集合是否包含66
 * (4) 删除集合中的77元素
 * (5)删除集合小于50的整数
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        (1)	生成10个1至100之间的随机整数(不能重复)，存入一个List集合
        Random random = new Random();
        while (list.size() < 10){
            int num = random.nextInt(100);  //生成[0,100)范围内的随机整数
            //如果list集合不包含num就添加到集合中
            if ( !list.contains(num)) {
                list.add( num );
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println( list.contains(66));

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (Integer.valueOf(77).equals(next)){
                iterator.remove();
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + "  ");
        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next < 50){
                iterator.remove();
            }
        }
        System.out.println("-------------");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
