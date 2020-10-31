package com.bjpowernote.stringxxx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 14:38
 */
public class Test4 {
    public static void main(String[] args) {
        //1）创建Data对象
        Date date = new Date();
        System.out.println(date);

        //2）获取当前时间距离1970-1-1 00:00:00 经过的毫秒
        long currentTimeMills = System.currentTimeMillis();
        System.out.println(currentTimeMills);

        long time = date.getTime();//获取data日期对应的毫秒数
        System.out.println(time);

        //3）根据毫秒数创建Data对象
        Date date1 = new Date(currentTimeMills + 1000*60*10);
        System.out.println(date1);
        date1 = new Date(100000000);
        System.out.println(date1);
        date1 = new Date(-165156165);
        System.out.println(date1);
        //4)把日期转换为指格式的字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss SS z");
        String ss = sdf.format(date);
        System.out.println(ss);

        //5
        String txt = "2088年05月12 08:28:58";
        SimpleDateFormat another = new SimpleDateFormat("yyyy年MM月dd日");

    }
}
