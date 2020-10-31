package com.bjpowernote.io.print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 11:01
 */
public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        //1)建立流通道
        PrintStream printStream = new PrintStream(new FileOutputStream("D:\\javaSEProjects\\xxx.txt"));

        //2）打印数据
        printStream.print("print方法打印不换行！！");
        printStream.println("println方法换行");
        printStream.println("第二行！！！");
        //3
        PrintStream old = System.out;
        System.setOut(printStream);
        System.out.println("sjdifjksjfk");
        System.setOut(old);
        System.out.println("sdfsdfsdadddddd");
        printStream.close();

    }
}
