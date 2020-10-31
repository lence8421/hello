package com.bjpowernote.io.filerw;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 14:46
 */
public class Test02 {
    //FileWriter可以以字符为单位 把数据写入
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //1) 建立字符流通道
//            fw = new FileWriter("d:/course/03-javase/out.txt", true);     //以追加的方式写入文件,要求文件编码与当前环境编码兼容
            //以覆盖 的方式写入文件
            fw = new FileWriter("D:\\javaSECode\\javasexxx\\out.txt");


            //2) 调用write()方法写入字符
            //一次写入一个字符
            fw.write('x');
            fw.write('x');
            fw.write('x');
            fw.write('x');
            fw.write('x');
            fw.write('x');

            //一次写入一个字符数组
            char[] chars = "hello动力节点".toCharArray();
            fw.write("\n");
            fw.write(chars);
            fw.write("\n");
            fw.write(chars,0,2);
            fw.write("\n");

            fw.write("使用FileWriter字符流可以直接写入字符串！！！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
