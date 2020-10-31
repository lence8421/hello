package com.bjpowernote.io.filerw;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 14:35
 */
public class Test01 {
    public static void main(String[] args) {
        String path = "D:\\javaSEProjects\\Day1024\\src\\com\\bjpowernote\\io\\print\\Test01.java";
        FileReader fr = null;
        m1(path, fr);
        m2();
    }

    private static void m2() {
        try (FileReader fr = new FileReader("D:\\javaSEProjects\\Day1024\\src\\com\\bjpowernote\\io\\print\\Test01.java")){
//        try (FileReader fr = new FileReader("D:\\course\\03-JavaSE\\gbks.txt")){
            //定义字符数组
            char [] chars = new char[1024*8];

            //调用read(char []chars)方法从文件中读取若干字符存储到chars字符数组 中 , 返回读到的字符的数量, 如果读到文件末尾返回-1
            int len = fr.read(chars);
            while ( len != -1){
                //可以把chars读取的前len个字符转换为字符串打印
                System.out.print( String.valueOf(chars, 0 ,len) );
                len = fr.read(chars);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m1(String path, FileReader fr) {
        try {
            fr = new FileReader(path);
            int code = fr.read();
            while (code != -1) {
                System.out.print((char) code);
                code = fr.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
