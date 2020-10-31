package com.bjpowernote.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 12:04
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //2添加一组元素
        map.put("javaSE","菲菲");
        map.put("数据库","花花");
        map.put("HTML5","老杜");
        map.put("wab前段","妞妞");
        map.put("spring框架","王老吉");
        map.put("手工课","二狗子");
        //3判断
        boolean b = map.containsKey("手工课");
        System.out.println(b);
        //4判断
        boolean b1 = map.containsValue("菲菲");
        System.out.println(b1);
        //判断html5 课程老师是谁；
        String html5 = map.get("HTML5");
        System.out.println(html5);
        //把王老吉老师替换成 肖战
        map.replace("spring框架","肖战");
        System.out.println(map);
        //删除数据库课
        map.remove("数据库");
        System.out.println(map);
        //查看开始了那些课程
        Set<String> set = map.keySet();
        System.out.println(set);
        //
        Collection<String> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }
}
