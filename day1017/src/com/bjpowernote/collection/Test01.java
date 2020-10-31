package com.bjpowernote.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 14:49
 */
public class Test01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        //2)向集合中添加元素
        collection.add(1213);
        collection.add(789);
        collection.add(12.21);
        collection.add("hello");
        collection.add(new Date());

        //查找
        System.out.println( collection.contains(789));

        //3）打印集合
        System.out.println(collection);

        //4)遍历集合中所有的元素
        for (Object o : collection) {
            System.out.print(o + "  ");
        }
        System.out.println();
        //5)删除

        collection.remove(1213);
        System.out.println(collection);
        collection.remove(12212121);

        //6）显示集合中的元素个数
        System.out.println(collection.size());
        //7）判断是否为空
        System.out.println(collection.isEmpty());

        //8)清空元素
        collection.clear();
        System.out.println(collection);

        //
        System.out.println(collection.hashCode());

    }
}
