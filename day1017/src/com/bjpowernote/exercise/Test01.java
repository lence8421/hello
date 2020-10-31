package com.bjpowernote.exercise;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 11:00
 * 2 从键盘上输入身份证号, 判断出生日期, 性别(倒数第二位是奇数表示男)
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入省份证号");
        String personId = "";

        String pattern = "[1-9]\\d{16}[0-9x]";

        while (true){
            personId = sc.next();
            //验证格式是否正确
            if (!personId.matches(pattern)){
                System.out.println("省份证号码格式不正确，请从新输入！！！");
                continue;
            }

            //判断出生日期
            String yearStr = personId.substring(6, 10);
            String monthStr = personId.substring(10, 12);
            String dayStr = personId.substring(12, 14);
            int year = Integer.parseInt(yearStr);
            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);
            if (month < 0 || month >12){
                System.out.println(month + "月份不合理，应该在1-12范围内，请从新输入");
                continue;
            }
            if (day < 0 || day >getMonthDay(year,month)){
                System.out.println(day + "天数不合理，请在1-" + getMonthDay(year,month) + "范围内，请从新输入");
                continue;
            }

            char sex = personId.charAt(16);
            if (sex % 2 == 0){
                System.out.println("性别: 女" );
            }else {
                System.out.println("性别: 男" );
            }

        }
    }

    private static int getMonthDay(int year, int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                return 30;
            case 2:
                return ifleap(year) ? 29 : 28;
        }
        return 0;
    }

    private static boolean ifleap(int year) {
        return year % 4 == 0 && year % 100 == 0 || year % 400 == 0;
    }
}
