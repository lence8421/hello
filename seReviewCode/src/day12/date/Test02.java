package day12.date;

import java.util.Scanner;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/13 21:49
 *  从键盘上输入年和月， 打印该月的日历
 */
public class Test02 {
    public static void main(String[] args) {
        //1)键盘获取YYYY-MM
        Scanner sc = new Scanner(System.in);
        System.out.print("请按照YYYY-MM的格式输入年份和月：");
        int year = sc.nextInt();
        int month = sc.nextInt();

        //2）调用方法打印日历
        printCalender(year,month);
    }

    private static void printCalender(int year, int month) {
        //1)先打印星期
        System.out.println("一\t二\t三\t四\t五\t六\t日\t");

        //空格加日期 7个一换行
        int count = 0; // 定义一个计数器
        //确定本月1号是星期几, 数字1表示星期一,2表示星期二....6表示星期六,7表示星期日
        int weekDay = getWeekDay(year,month,1);
        //2) 打印第一行的空格
        for (int i = 0; i < weekDay; i++) {
            System.out.print("\t");
            count++;
        }
        //3)打印日期(year-month某个月的日历)
        for (int i = 1; i <= getMonthDay(year,month); i++) {
            System.out.print(i + "\t");
            count++;
            if (count % 7 == 0){
                System.out.println();
            }
        }
    }

    private static int getWeekDay(int year, int month, int day) {
       //已知1900-1-1 是星期一, 计算 year-month-day 日期是星期几, 就需要计算从1900-1-1 到year-month-day这一天总共经过了多少天, 总天数对7求余的余数可以作为星期几
        //1）先算距离1900-1-1多少年
        int sum = 0; //累加天数和
        for (int i = 1900; i < year ; i++) {
            sum += isleap(year) ? 366 : 365;
        }
        //2）再算 year 的 month - 1 月的天数
        for (int i = 1; i < month; i++) {
            sum += getMonthDay(year,i);//获取month-1 个月的天数
        }
        //3)再计算返回星期几
        sum +=  day;
        int r = sum % 7;
        return r == 7 ? 0 : r;
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
                return isleap(year) ? 29 : 28;
        }
        return 0;
    }

    private static boolean isleap(int year) {
        //判断是否为闰年
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
