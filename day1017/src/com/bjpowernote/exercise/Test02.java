package com.bjpowernote.exercise;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 11:33
 * 3 有字符串”101,lisi,99;202,wangwu,78;303,chenqi,86;404,zhaosi,42;505,feifei,18”保存学生的学号,姓名,成绩
 * 	要求根据字符串中学生的信息创建Student对象, 再把这些Student对象保存到数组中
 */
public class Test02 {
    public static void main(String[] args) {
        String txt = "101,lisi,99;202,wangwu,78;303,chenqi,86;404,zhaosi,42;505,feifei,18";

        // 创建一个存储Student对象的数组
        Student [] data = new Student[50];//数组长度需要估算；
        int size = 0 ; //定义变量记录素组元素中的数量

        //2）拆分字符串
        String[] split = txt.split("[,;]");

        //遍历数组，并把每三个一组的数组元素打包成对象，给了Student对象；
        for (int i = 0; i < split.length; i+=3) {
            Student[] str = new Student[split.length-1];
            str[i] = new Student(Integer.valueOf(split[i]),split[1+i],Integer.valueOf(split[i+2]));
            data[size++] = str[i];
        }

        for (Student datum : data) {
            System.out.println(datum);
        }

    }
}
