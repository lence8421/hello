package com.bjpowernote.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 12:21
 */
public class Test03 {
    public static void main(String[] args) {
        String txt ="dsfgdsfdsgsdfwegghgfjytutyjkuyymcnfghaaadd";
        //统计字符串中每个字符出现的次数

        //
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < txt.length(); i++) {
            char cc  = txt.charAt(i);

            if(!map.containsKey(cc)){//不重复就添加
                map.put(cc,1);
            }else {//重复就修改（替换）
                Integer old = map.get(cc);
                map.replace(cc,old + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "字符出现的次数：" + entry.getValue());
        }
}
}
