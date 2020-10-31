package com.homework.demo01;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/12 17:39
 * 1 从键盘上输入年和月， 打印该月的日历
 * 输入： 2020 	10
 * 输出：
 * 	一	二	三	四	五	六	日
 * 				1	2	3	4
 * 	5	6	7	8	9	10	11
 * 	12	13	14	15	16	17	18
 * 	19	20	21	22	23	24	25
 * 	26	27	28	29	30	31
 * 已知: 1900-1-1是星期一， 计算year-month-day日期是星期几，
 * 可以先计算year-month-day距离1900-1-1经过的总天数，
 * 总天数对7求余的余数可以作为星期几 。
 * 1—星期一； 2—星期二， 。。。。6—星期六， 0—星期日
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请按照 yyy MM 的格式输入：");
        int year = input.nextInt();
        int month = input.nextInt();

       /* 求距离 1900-1-1 的天数
       int a = year - 1900;
       a * 366 + 当年的月数的天数*/
        int x = 0;
       int a = getSumYear(year,month);
       int b = getSum1Month(year,month);
        for (int i = 1; i <= b; i++) {
            System.out.print(i+"\t");
            x++;
            if (x % 7 == 0){
                System.out.println();
            }
        }


    }

    private static int getSumYear(int year, int month) {
        int sum = 0;
        for (int i = 0; i < year - 1 - 1900 ; i++) {
            if (isleap(year)){
                sum += 366;
            }else {
                sum += 365;
            }
        }
        //某年的天数 + 距离1900年的天数
        return sum + getSumMonth(year,month);
    }

     private static int getSumMonth(int year, int month) {
         int proSum= 0;
         for (int i = 1; i <= month; i++) {
            proSum += getSum1Month(year, i);
         }
         return proSum;
    }

    private static int getSum1Month(int year, int i) {
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
                return isleap(year) ? 29 : 28;
        }
        return 0;
    }

    private static boolean isleap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
