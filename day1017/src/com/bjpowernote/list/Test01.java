package com.bjpowernote.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 19:42
 * List集合的基本操作
 */
public class Test01 {
    public Test01() {
    }

    public static void main(String[] args) {
        //1创建list集合存储string字符串，通过泛型指定存储元素类型为string,list是一个接口需要赋值实现类对象；
        List<String> list= new ArrayList<>();

        //2.添加元素调用add（）；
        list.add("jj");
        list.add("mm");
        list.add("dd");
        list.add("mm");
        list.add("jj");
        list.add("dd");
        list.add("jj");

        //3）直接打印list，list集合存储元素的顺序与添加顺序一致，可以存储重复的元素
        System.out.println(list);

        //4)判断
        System.out.println(list.size());//list 集合中有多少个元素 返回int
        System.out.println(list.contains("jj")); //判断集合中是否包含"jj"字符串对象，返回boolean

        //foreach遍历
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n-------------------");

        //6)删除第一个匹配的元素
        list.remove("jj");
        System.out.println(list);

        //7）迭代删除所有的dd
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
           if ("dd".equals(next)){
               iterator.remove();
           }
        }

        //8）list集合为每个元素指定了索引值，增加了对索引值的操作
        //8.1可以在指定的索引值 添加元素；
        list.add(0,"sdsd");
        System.out.println(list);
        list.add(3,"小哥哥");
        System.out.println(list);

        //8.2删除指定的索引值
        String removed = list.remove(0);//删除第0个元素，把删除的元素返回
        System.out.println(list);
        System.out.println(removed);

        //8.3返回元素在list集合中的索引值；
        System.out.println(list.indexOf("mm"));//返回mm元素在list集合中第一次出现的索引值；
        //8.4返回指定位置的元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        //8.5 通过for循环遍历list集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

    }
}
