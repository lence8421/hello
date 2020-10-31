package com.homework.demo02;

import java.util.Scanner;

/**
 * 从键盘上输入年和月， 打印该月的日历
 */
public class Test02 {
    public static void main(String[] args) {
        //从键盘上输入年和月
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年和月");
        int year = sc.nextInt();
        int month = sc.nextInt();

        //打印该月的日历
        printCalender(year, month);
    }

    //定义方法打印日历
    private static void printCalender(int year, int month) {
        //日历包括两部分, 第一行显示星期,第二行开始打印本月的数字
        //第一行
        System.out.println("一\t二\t三\t四\t五\t六\t日\t");

        //打印数字,每7个数字就需要换行
        int count = 0 ;         //定义计数器变量

        //确定本月1号是星期几, 数字1表示星期一,2表示星期二....6表示星期六,7表示星期日
        int weekday = getWeekDay(year, month, 1);
        //打印第一行前面的空白
        for (int i = 1; i < weekday; i++) {
            System.out.print("\t");
            count++;
        }

        //开始打印本月数字
        int monthdays = getMonthDays(year, month);
        for (int i = 1; i <= monthdays ; i++) {
            System.out.print(i + "\t");
            count++;
            if ( count % 7 == 0 ){
                System.out.println();   //换行
            }
        }

    }

    //定义方法,返回指定日期对应星期几, 数字1表示星期一,数字2表示星期2, 数字7表示星期日
    private static int getWeekDay(int year, int month, int day) {
        //已知1900-1-1 是星期一, 计算 year-month-day 日期是星期几, 就需要计算从1900-1-1 到year-month-day这一天总共经过了多少天, 总天数对7求余的余数可以作为星期几
        int sum = 0 ;   //保存总天数
        //先累加整年的天数
        for(int i = 1900; i < year; i++){
            sum += isleap(i) ? 366 : 365;
        }
        //再累加year这一年整月的天数
        for (int i = 1; i < month ; i++) {
            sum += getMonthDays(year, i);
        }
        //再累加year年,month月的天数
        sum += day;
        int r = sum % 7 ;       //0123456
        return r == 0 ? 7 : r;  //把余数0修正为7表示星期日
    }


    /**
     * 定义方法返回指定月份的天数
     * @param year 接收年份
     * @param month 接收月份
     * @return 返回该月的天数
     */
    private static int getMonthDays(int year, int month) {
        switch (month){
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
                //2月份的天数还跟闰年有关
                if ( isleap(year) ){
                    return 29;
                }else {
                    return 28;
                }
        }
        return 0;
    }

    /**
     * 判断某一年是否为闰年
     * @param year  接收一个年份
     * @return 返回true表示闰年， false表示平年
     */
    private static boolean isleap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
    }


}
