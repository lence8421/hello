package com.bjpowernote.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/22 10:40
 */
public class Test01 {
    public static void main(String[] args) {
        TreeMap<Car, String> treeMap = new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        });

        Car car = new Car("sihao", "white", 8);
        treeMap.put(car, "laocui");
        treeMap.put(new Car(), "ergouzi");
        System.out.println(treeMap);
    }

}
