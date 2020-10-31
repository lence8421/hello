package com.bjpowernote.map;

import java.util.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/22 11:33
 */
public class Test03 {
    public static void main(String[] args) {
        String urlText = "www.bjpowernode.com/register?name=feifei&age=26&interest=sing&interest=dance&interest=game";
        String[] split = urlText.split("[?=&]");
        Map<String,String[]> map = new HashMap<>();
        for (int i = 1; i < split.length; i+=2) {
            if (!map.containsKey(split[i])){
                map.put(split[i],new String[]{split[i + 1]});
            }else {
                String[] strings = map.get(split[i]);
                strings = Arrays.copyOf(strings,strings.length + 1);
                strings[strings.length - 1 ] = split[i + 1];
                map.replace(split[i],strings);
            }

        }
        for (Map.Entry<String, String[]> stringEntry : map.entrySet()) {
            System.out.println(stringEntry.getKey() + ":" + Arrays.toString(stringEntry.getValue()));
        }
    }
}
