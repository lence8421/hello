package com.bjpowernote.array.demo01;

import java.util.Scanner;



/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 10:52
 * 已知: 1900-1-1是星期一， 计算year-month-day日期是星期几，可以先计算year-month-day距离1900-1-1经过的总天数，
 * 总天数对7求余的余数可以作为星期几 。 1—星期一； 2—星期二， 。。。。6—星期六， 0—星期日 
 */
public class Test02 {
    public static void main(String[] args) {
        //1）输入年月
        Scanner input = new Scanner(System.in);
        System.out.print("请按照yyy MM 的格式输入：");
        int year = input.nextInt();
        int month = input.nextInt();

        //2）计算该月日历表
        int num = getCalendar(year, month);

        //3)打印该月日历
        System.out.println(num);
    }

    private static int getCalendar(int year, int month) {
        //输出星期数
        System.out.print("日" + "\t" + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六");

        if (year >= 1900){
            //获取距离1900-1-1日的天数
            for (int i = 0; i <= year-1900; i++) {
                //计算距离当年的第几天
               return getSumDay(year,month);
                    
                }
            }
        return 0;
        }

    private static int getSumDay(int year, int month) {
        int sum= 0;
        for (int i = 1; i < month; i++) {
            sum += getSumMonth(i,year);
        }
        return sum ;
    }
    /**
     * 定义方法返回指定月份的天数
     * @param year 接收年份
     * @param i 接收月份
     * @return 返回的天数
     */
    private static int getSumMonth(int i,int year) {
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

    private static int getSumYear(int year) {
      if(isleap(year)){
          return 29;
      }
      return 28;
    }
    /**
     * 判断某一年是否为闰年
     * @param year  接收一个年份
     * @return 返回true表示闰年， false表示平年
     */
    private static boolean isleap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}


