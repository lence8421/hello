package com.bjpowernote.io.bufferestream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 10:25
 */
public class Test02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //1）创建输出字节流
             fos = new FileOutputStream("D:\\javaSEProjects\\abc.txt");
            //2）创建
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            //3）//写入
            fos.write(78);
            //4）刷新缓冲流
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos == null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
