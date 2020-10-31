package com.bjpowernote.stringxxx;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 10:40
 */
public class Tset02 {
    public static void main(String[] args) {
        //1.从键盘上输入电话号码，验证用户的输入是否符合合格格式
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一手机号：");
        String phoneNum = sc.next();
        String patter = "1[356789]\\d{9}";
        System.out.println(phoneNum.matches(patter));

        //2.把字符串中的数字使用*替换；
        String txt = "xiaohua3221312321xiaoxingxing";
        String anouther = txt.replaceAll("\\d","#");
        System.out.println(anouther);
        System.out.println(txt);

        //3.对字符串拆分
        txt = "asd dsfa sd fffdsf sdfsd fsdf sdfas, sdfsdfaswewew sdfsd";
        String[] split = txt.split("[ ,]");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
