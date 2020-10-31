package com.bjpowernote.stringxxx;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 9:08
 */
public class Test01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符串与字节数组的转换

        String str = "hello动力节点";
        System.out.println(str.contains("hello"));
        System.out.println(str.startsWith("动力节点"));
        System.out.println(str.endsWith("hell"));
        System.out.println(str.equals("hello动力节点"));
        System.out.println(str.equalsIgnoreCase("Hello动力节点"));
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str.getBytes("Gbk");
        System.out.println(Arrays.toString(gbks));

        str = new String(gbks, "GBk");
        System.out.println(str);

        String path = "D:\\javaSEProjects\\day1016\\src\\com\\bjpowernote\\stringxxx\\Test01.java";

        int last = path.lastIndexOf("\\");
        int dot = path.lastIndexOf(".");
        String xxx = path.substring(0, last);
        String yyy = path.substring(last + 1, dot);
        String zzz = path.substring(dot + 1);
        System.out.println(xxx);
        System.out.println(yyy);
        System.out.println(zzz);

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
        System.out.println();

        str = String.valueOf(chars);
        System.out.println(str);
        str = new String(chars);

        str = "     hello  word     ";
        String trim = str.trim();//去掉空白
        System.out.println("**" + trim + "**");
        System.out.println(str);

        int num = 2323232;
        str = String.valueOf(num);//把整数转换成字符串

        str = "356";
        num  = Integer.parseInt(str);//把字符串转换为int类型；

    }
}
