package com.bjpowernote.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 11:03
 */
public class Test01 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String,Integer> map = new HashMap<>();
        //添加 键值对；
        map.put("lisi",5000);
        map.put("wangwu",6000);
        map.put("zhaoliu",5500);
        map.put("chenqi",55000);
        map.put("feifei",50300);
        map.put("ergouzi",50100);
        map.put("xiaohua",50100);
        //3) 直接打印, 调用hashMap对象的toString()方法, 存储顺序与添加顺序可能不一样
        System.out.println(map);
        //判断
        System.out.println(map.containsKey("lisi"));

        System.out.println(map.containsValue(6000));
        //查看键对应的值
        Integer lisi = map.get("lisi");
        System.out.println(lisi);

        //替换
        Integer feifei = map.replace("feifei", 60000);
        System.out.println(map);
        //8) 删除调用remove(key), 只要map中存在key这个键就把对应的键值对删除
        map.remove("xiaohua");
        System.out.println(map);
        //9) 查看所有员工 的姓名, 调用keySet()返回所有的键
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        //10) 查看所有员工的工资, 调用values()返回所有值
        Collection<Integer> values = map.values();
        System.out.println(values);
        //11 查看每个人的工资, 调用entrySet()返回所有Entry的集合,  Entry就是一个键值对, Entry是Map接口中的一个内部接口,  将来看到  类名.类名 的形式时, 这是使用了一个内部类
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);
        /******注意:  keySet(), values(), entrySet()这些方法并没有生成新的集合***********/
        keySet.remove("chenqi");//从keySet集合中删除chenqi, 其实是把Map中对应的键值对删除了
        System.out.println(keySet);//从values集合中删除元素, 会把map中对应的键值对删除

        values.remove(5500);
        //Entry有getKey()方法返回键, getValue()方法返回值.  经常使用foreach循环遍历map, 输入iter后可以选择遍历map的哪一部分
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry);
        }
    }
}
