package com.bjpowernote.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/22 16:24
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list,"xx","yy","aa","dd","mm");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.shuffle(list);
        System.out.println(list);
    }
}
