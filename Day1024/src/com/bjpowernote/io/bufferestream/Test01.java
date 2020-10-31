package com.bjpowernote.io.bufferestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 10:23
 */
public class Test01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //1）创建字节流
            fis = new FileInputStream("D:\\javaSEProjects\\abc.txt");
            //2)创建缓冲流
            BufferedInputStream bis = new BufferedInputStream(fis);

            //3)从缓冲流中读取数据
            fis.read();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
