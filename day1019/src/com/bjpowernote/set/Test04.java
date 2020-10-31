package com.bjpowernote.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 16:34
 */
public class Test04 {
    public static void main(String[] args) {
     //1) 创建TreeSet集合存储String字符串, 根据 字符串降序排序, 可以在TreeSet构造方法的参数中传递Comparator比较器
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });

        treeSet.add("aa");
        treeSet.add("mm");
        treeSet.add("vv");
        treeSet.add("dd");
        treeSet.add("fff");
        treeSet.add("xx");
        System.out.println( treeSet);

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.addAll(treeSet);
        System.out.println(treeSet2);



    }
}
