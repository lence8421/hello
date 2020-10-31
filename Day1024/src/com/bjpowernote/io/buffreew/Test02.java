package com.bjpowernote.io.buffreew;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 16:11
 */
public class Test02 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            //先创建字符流
            FileWriter fw = new FileWriter("D:\\javaSEProjects\\abc.txt",true);
            //再创建缓冲流
            bw = new BufferedWriter(fw);

            //使用缓冲流写入数据
            bw.write("这是写入的第一行字符串");
            //BufferedWriter有一个换行的方法
            bw.newLine();
            bw.write("这是写入的第二行");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( bw != null ){
                //关闭
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
