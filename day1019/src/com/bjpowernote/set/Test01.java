package com.bjpowernote.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 16:39
 */
public class Test01 {
    public static void main(String[] args) {
       //1) 创建Set集合存储String字符串, 通过泛型指定存储元素的类型是String,  Set是一个接口需要赋值实现类对象
        Set<String> set = new HashSet<>();
        //2)添加元素
        set.add("xx");
        set.add("bb");
        set.add("ppp");
        set.add("21321321");
        set.add("yy");
        set.add("mmmmmm");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains("yy"));
        for (String s : set) {
            System.out.print(s + "\t");
        }

        //迭代删除
    }
}
