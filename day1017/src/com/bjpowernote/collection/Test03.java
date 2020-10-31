package com.bjpowernote.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 16:12
 */
public class Test03 {
    public static void main(String[] args) {
        //创建存储String 字符串集合
        Collection<String> collection = new ArrayList<>();
        //添加元素
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");
        collection.add("dd");
        collection.add("ee");
        collection.add("ww");
        collection.add("qq");
        //1）可以在已存在的collection集合上，创建一个新的collection集合
        Collection<String> collection1 = new ArrayList<>(collection);
        System.out.println(collection1);

        //2)可以把一个集合中所有的元素添加到另一个集合中
        Collection<String> collection2 = new ArrayList<>();
        System.out.println(collection2);
        collection2.addAll(collection1);
        System.out.println(collection2);

        //3）可以从集合中删除在参数集合中出现的所有元素
        collection2.add("xx");
        collection2.add("aa");
        collection2.add("yy");
        System.out.println(collection2);
        collection2.removeAll(collection);
        System.out.println(collection2);
    }
}
