package com.homework.demo03;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 9:05
 */
public class Test {
    public static void main(String[] args) {
        //输入年 月份
        Scanner input = new Scanner(System.in);
        System.out.print("请按照yyy MM 输入：");
        int year = input.nextInt();
        int month = input.nextInt();

        //定义打印方法
        printCalendr(year,month);
    }

    private static void printCalendr(int year, int month) {
        //日历包括两部分第一行 打印显示星期
        //第二行开始打印本月的数字
        int count = 0;    //定义
        //第一行
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //确定本月的1号是星期几，数字1表示一
        int weekday = getWeekDay(year,month,2);
        //打印第一行前面的空白
        for (int i = 1; i < weekday; i++) {
            System.out.print("\t");
            count++;
        }

        //开始打印本月日期
        int monthDay = getSumMonth(year,month);
        for (int i = 1; i <= monthDay; i++) {
            System.out.print(i + "\t");
            count++;
            if (count % 7 == 0 ){
                System.out.println();
            }
        }
    }

    //定义方法,返回指定日期对应星期几, 数字1表示星期一,数字2表示星期2, 数字7表示星期日
    private static int getWeekDay(int year, int month, int day) {
        //已知1900-1-1 是星期一, 计算 year-month-day 日期是星期几,
        // 就需要计算从1900-1-1 到year-month-day这一天总共经过了多少天,
        // 总天数对7求余的余数可以作为星期几
        int sum = 0;//累加天数和
        //计算整年的天数
        for (int i = 1900; i < year ; i++) {
           sum = isleap(year) ? 366 : 365 ;
        }

        //计算year整月的天数；
        for (int i = 1; i < month ; i++) {
            sum += getSumMonth(year,i);
       }

        //返回  星期数
        sum += day;
        int r = sum % 7;
        return r == 7 ? 0 : r;
    }

    private static int getSumMonth(int year, int i) {
        switch (i){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isleap(year) ? 29 : 28;
        }
        return 0;
    }

    private static boolean isleap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
