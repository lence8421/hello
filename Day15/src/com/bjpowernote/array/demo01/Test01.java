package com.bjpowernote.array.demo01;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 9:25
 */
public class Test01 {
    public static void main(String[] args) {
        //1）从键盘输入一个日期
        Scanner input = new Scanner(System.in);
        System.out.print("请按年yyy 月MM 日dd的格式：");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        //2)计算日期是当年的第几天；
        int sum = getSumDays(year, month, day);
        //3）打印输出

        System.out.println(year + "年 " + month + "月 " + day + "日是\n" + year + "年的第" + sum + "天");
    }

    private static int getSumDays(int year, int month, int day) {
        int sum = 0;
        for (int i = 1; i < month; i++) {
            sum += getSumMonth(year, i);
        }
        return  sum + day;
    }

    private static int getSumMonth(int year, int i) {
        switch (i) {
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
                return getSumYear(year);
        }
        return 0;
    }

    static int getSumYear(int year) {
        if (isYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    private static boolean isYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
