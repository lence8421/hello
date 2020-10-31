package com.bjpowernode.listmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 9:28
   [
 *        {
 * 	    date: "今天（周三）",
 * 	    weather: "多云",
 * 	    wind: "微风",
 * 	    temperature: "23℃"
 *    },
 *    {
 * 	    date: "明天（周四）",
 * 	    weather: "雷阵雨转中雨",
 * 	    wind: "微风",
 * 	    temperature: "29～22℃"
 *    },
 *    {
 * 	    date: "后天（周五）",
 * 	    weather: "阴转多云",
 * 	    wind: "微风",
 * 	    temperature: "31～23℃"
 *    },
 *    {
 * 	    date: "大后天（周六）",
 * 	    weather: "多云",
 * 	    wind: "微风",
 * 	    temperature: "31～24℃"
 *    }
 * ]
 */
public class Test01 {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();

        Map<String,String> map = new HashMap<>();
        map.put("date","今天（周三）");
        map.put("weather","多云");
        map.put("wind","微风");
        map.put("temperature", "23℃");
        list.add(map);      //把map添加到list中

        map = new HashMap<>();   //new出来一个新的Map
        //向map中添加数据
        map.put("date", "明天（周四）");
        map.put("weather","雷阵雨转中雨");
        map.put("wind","微风");
        map.put("temperature", "29～22℃");
        list.add(map);      //把map添加到list中
        map = new HashMap<>();   //new出来一个新的Map
        //向map中添加数据
        map.put("date", "后天（周五）");
        map.put("weather","阴转多云");
        map.put("wind","微风");
        map.put("temperature", "31～23℃");
        list.add(map);      //把map添加到list中

        map = new HashMap<>();   //new出来一个新的Map
        //向map中添加数据
        map.put("date", "大后天（周六）");
        map.put("weather","多云");
        map.put("wind","微风");
        map.put("temperature", "31～24℃");
        list.add(map);      //把map添加到list中

        //2) 把集合中存储的具体数据生成指定格式 的字符串
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        //遍历list集合中的每个map集合
        for (int i = 0; i < list.size(); i++) {
            map = list.get(i);
            //遍历map集合中的每个键值对
            sb.append("\t{\n");
            int count = 0 ;     //定义计数器变量,统计遍历Entry的数量
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\t\t" + entry.getKey() + " : \"" + entry.getValue() + "\"");
                count++;        //计数
                if ( count < map.size()){   //判断在entry之间使用逗号分隔
                    sb.append(",");
                }
                sb.append("\n");
            }
            sb.append("\t}");
            //map与map之间使用逗号分隔
            if ( i < list.size() - 1){
                sb.append(",");
            }
            sb.append("\n");
        }

        sb.append("]\n");
        System.out.println(sb);
    }
}
