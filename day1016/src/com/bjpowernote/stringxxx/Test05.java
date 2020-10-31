package com.bjpowernote.stringxxx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 15:28
 */
public class Test05 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH：mm：ss ");
        String ss = localDateTime.format(dft);
        System.out.println(ss);

        String txt = "2088年5月12日 8:28:58";
        DateTimeFormatter another = DateTimeFormatter.ofPattern("yyyy年M月dd日 H:mm:ss");
        LocalDateTime dataTime = LocalDateTime.parse(txt,another);
        System.out.println(dataTime);
    }
}
