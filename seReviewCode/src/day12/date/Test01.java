package day12.date;

import java.time.Year;
import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 21:49
 * 从键盘上输入一个日期， 打印该日期对应当年的第几天。
 */
public class Test01 {
    public static void main(String[] args) {
        //1)输入一个日期（YYY-MM-DD）
        Scanner sc = new Scanner(System.in);
        System.out.print("请按照YYY-MM-DD的格式输入：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        //2）计算当年的第几天
        int num = getSumDay(year,month,day);

        //3）打印输出
        System.out.println(year + "年的第几天" + num);
    }

    private static int getSumDay(int year, int month, int day) {
        int sum = 0;
        //累加
        for (int i = 1; i < month; i++) {
            sum += 每个月的天数(i,year);
        }
        return sum + day;
    }

    private static int 每个月的天数(int i,int year) {
        switch (i){
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
                return 判断是否为闰年(year) ? 29 : 28;
        }
        return 0;
    }

    private static boolean 判断是否为闰年(int year) {
        return year % 4 == 0 && year % 100 != 0|| year % 400 ==0 ;
    }
}
