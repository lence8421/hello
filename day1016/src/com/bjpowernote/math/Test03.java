package com.bjpowernote.math;

import java.text.DecimalFormat;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 16:41
 */
public class Test03 {
    public static void main(String[] args) {
        //创建DecimalFormat对象，通过构造方法指定格式串
        DecimalFormat df = new DecimalFormat("####,###.00000");
        double dd = 123456.12;
        String ss = df.format(dd);
        System.out.println(ss);
        System.out.println(df.format(3.115615));

        DecimalFormat df2 = new DecimalFormat("0000");
        System.out.println(df2.format(2));
        System.out.println(df2.format(25165));
        System.out.println(df2.format(25465));
        System.out.println(df2.format(2132));
        System.out.println(df2.format(2231321));
    }
}
