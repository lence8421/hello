package com.bjpowernote.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 15:10
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        //2）添加泛型指定的String字符串
        collection.add("小姐姐");
        collection.add("小妞妞");
        collection.add("二狗子");
        collection.add("小妹妹");
        collection.add("小迪迪");
        collection.add("小妞妞");
        collection.add("小妞妞");
        collection.add("小妞妞");
        collection.add("小雅雅");
        collection.add("大姐姐");
        collection.add("小妞妞");
        collection.add("小姐姐");

        System.out.println(collection);
        //3)Iterator迭代器
        Iterator<String> stringIterator = collection.iterator();
        while ( stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        //4)删除单个元素
        collection.remove("二狗子");
        //删除所有的小姐姐，可以使用循环；
        while (collection.contains("小姐姐")){
            collection.remove("小姐姐");
        }
        //存在问题：contains（）判断是需要变量一次集合，remove()删除是还需要遍历一次集合，下次循环还是在这样，既需要遍历好多次集合
        System.out.println(collection);

        //用迭代器删除 快捷键 itco
        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();
            if ("小妞妞".equals(next)){
                iterator.remove();
            }
        }
        System.out.println(collection);
    }
}
