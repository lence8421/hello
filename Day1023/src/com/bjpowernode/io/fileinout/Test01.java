package com.bjpowernode.io.fileinout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 15:08
 * FileInputstream 从文件中读取以字节为单位读取数据
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\javaSEProjects\\abc.txt");
        //1）该文件的内容是：abcxxx zzz
        //2)FileInputStream流的基本操作
        //2.1 available () 返回流中还有多少个字节未读；
        System.out.println(inputStream.available());
        //2.2调用read（）方法可以通过流从文件中读取一个字节，并返回读到的字节，如果读到文件末尾 返回 -1；
        int read = inputStream.read();
        System.out.println(read);
        System.out.println( inputStream.available());

        //2.3） skip（n） 跳过n个字节
        inputStream.skip(3);
        System.out.println(inputStream.available());
        read = inputStream.read();
        System.out.println(read);

        //3)从文件中读取数据后，要关闭流通道
        inputStream.close();
    }
}
