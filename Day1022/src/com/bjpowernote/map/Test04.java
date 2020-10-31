package com.bjpowernote.map;

import java.util.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/22 11:33
 */
public class Test04 {
    public static void main(String[] args) {
        String urlText = "www.bjpowernode.com/register?name=feifei&age=26&interest=sing&interest=dance&interest=game";
        String[] split = urlText.split("[?=&]");
        Map<String, List<String>>map = new HashMap<>();
        //3) 从索引值为1开始遍历split数组, 每次取2个数据
        for (int i = 1; i < split.length; i+=2 ) {
            //split[i]是参数名, split[i+1]是参数值
            //如果map的键不包含 split[i]参数名, 就向map中添加
            if ( !map.containsKey(split[i])){
                //添加时,需要把split[i+1]参数值放在List集合中
                List<String> list = new ArrayList<>();
                list.add(split[i+1]);
                //向map中添加数据, 键是split[i]参数名, 值是存储split[i+1]的一个list集合
                map.put(split[i], list );
            }else {
                //map的键包含split[i]参数名, 需要先把split[i]参数名在map中的值取出来
                List<String> list = map.get(split[i]);
                //把split[i+1]参数值添加到list集合中
                list.add(split[i+1]);
                //仅仅是向list集合中添加了数据, 没有对list重新赋值, 添加数据的这个list集合依然是map的value值
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry);
        }

        }
}
