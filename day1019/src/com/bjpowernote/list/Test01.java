package com.bjpowernote.list;

import java.util.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 9:29
 */
public class Test01 {
    public static void main(String[] args) {
        //创建list集合
        List<String> list = new ArrayList<>();
        //向集合中添加元素
        list.add("xx");
        list.add("yy");
        list.add("xx");
        list.add("aa");
        list.add("yy");
        list.add("bb");
        list.add("aa");
        list.add("dd");
        System.out.println(list);//[xx, yy, xx, aa, yy, bb, aa, dd]
        /*1)
            ListIterator<E> listIterator()  方法返回 ListIterator 迭代器, ListIterator继承了Iterato迭代器, 所以就继承了 hasNext(), next(), remove()方法, 在 ListIterator 子接口中新增了:
                hasPrevious()  判断游标前面是否还有元素
                previous() 返回游标前面的元素
                add() 添加元素
                set() 设置元素
            即 ListIterator 迭代不仅可以向后迭代, 还可以向前迭代
         */
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){//向后迭代
            String next = stringListIterator.next();
            System.out.print(next + "   ");
        }
        System.out.println("---------------------------------------------");

        while (stringListIterator.hasPrevious()){//向前迭代
            String previous = stringListIterator.previous();
            System.out.print(previous + "   ");
        }
        System.out.println("------------------------------");

        while (stringListIterator.hasNext()){
            String s = stringListIterator.next();
            if ("xx".equals(s)){
                stringListIterator.set("xxxxx");//修改
            }else if ("yy".equals(s)){
                stringListIterator.remove();//删除
            }else if ("aa".equals(s)){
                stringListIterator.add("hhhhhhhhhhhhh");//添加
            }
        }
        System.out.println(list);

        //2)sort(Comparator<? super E> c) 对集合中的元素进行排序
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });

        System.out.println(list);

        /*3)
            List<E> subList(int fromIndex, int toIndex)  返回List集合中[fromIndex, toIndex)范围内的一个视图,
            注意,subList()方法并没有返回一个新的集合, 而提供了一个查看List集合部分元素的一种方式
         */
        List<String> subList = list.subList(0, 5);//截取list集合子串
        System.out.println(subList);
        subList.set(0,"QQQ");

        System.out.println(list);

        subList.remove(3);//操作截取的子串，进行删除，不能对list集合修改
        System.out.println(list);
        System.out.println(subList);

        subList.add(1,"HHH");//操作截取的子串，进行添加，能对list集合修改
        System.out.println(list);

        subList.clear();
        System.out.println(list);
        System.out.println("--------------------");

         /*4)
                Object[] toArray()  根据List集合创建一个数组
                <T> T[] toArray(T[] a)  会把list集合中的元素保存到参数a数组中
         */
        Object[] objects = list.toArray();
        for (Object o : objects) {
            //需要先进行对象向下转型
            String s = (String) o;
            System.out.println(o + "----------" + s.length());
        }
        //当前 List集合存储String字符串, 可以先创建一个存储String字符串的数组
        String[] data =  new String[ list.size() ];
        String[] strings = list.toArray(data);
        System.out.println(Arrays.toString(data));
    }
}
