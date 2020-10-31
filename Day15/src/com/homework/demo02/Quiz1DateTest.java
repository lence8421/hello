package com.homework.demo02;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz1DateTest {
    private int year;
    private int month;
    private int day;

    public Quiz1DateTest() {
    }

    public static void main(String[] args) {
        for(int loop = 1; loop > 0; ++loop) {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            System.out.print("输入年");
            int y = sc1.nextInt();
            System.out.print("输入月");
            int m = sc2.nextInt();
            System.out.print("输入日");
            int d = sc3.nextInt();
            Quiz1DateTest d1 = new Quiz1DateTest();
            d1.setYear(y);
            d1.setMonth(m);
            d1.setDay(d);
            System.out.println("你输入的时间是" + d1.getYear() + "年" + d1.getMonth() + "月" + d1.getDay() + "日");
            System.out.println("两个日期相距" + d1.count() + "天");
        }

    }

    public void setYear(int year) {
        this.year = year;
        if (year <= 1900) {
            this.year = 1900;
        }

    }

    public int getYear() {
        return this.year;
    }

    public void setMonth(int month) {
        this.month = month;
        if (month <= 0 | month >= 13) {
            this.month = 1;
        }

    }

    public int getMonth() {
        return this.month;
    }

    public void setDay(int day) {
        this.day = day;
        if (this.year % 4 == 0) {
            switch(this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 | day > 31) {
                    this.day = 1;
                } else {
                    this.day = day;
                }
                break;
            case 2:
                if (day < 1 | day > 29) {
                    this.day = 1;
                } else {
                    this.day = day;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 | day > 30) {
                    this.day = 1;
                } else {
                    this.day = day;
                }
            }
        } else {
            switch(this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 1 | day > 31) {
                    this.day = 1;
                } else {
                    this.day = day;
                }
                break;
            case 2:
                if (day < 1 | day > 28) {
                    this.day = 1;
                } else {
                    this.day = day;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 | day > 30) {
                    this.day = 1;
                } else {
                    this.day = day;
                }
            }
        }

    }

    public int getDay() {
        return this.day;
    }

    public int count() {//这个方法最终获得的时间不准确，
    	    //求解
        Calendar c1 = Calendar.getInstance();
        c1.clear();
        c1.set(1900, 0, 1);
        Calendar c2 = Calendar.getInstance();
        c2.clear();
        c2.set(this.year, this.month - 1, this.day);
        long t1 = c1.getTimeInMillis();
        long t2 = c2.getTimeInMillis();
        long days = (t2 - t1) / 86400000L;
        int retValue = (int)days;
        return retValue ;
    }
}
