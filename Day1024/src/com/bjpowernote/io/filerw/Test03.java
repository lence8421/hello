package com.bjpowernote.io.filerw;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 15:13
 * 使用InputStraemReader 读取GBK格式的文件
 */
public class Test03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //1)建立字节流
             fis = new FileInputStream("D:\\javaSECode\\javasexxx\\gbks.txt" );

            InputStreamReader os = new InputStreamReader(fis,"GBk");
            int code = os.read();
            while (code != -1){
                System.out.println((char)code);
                code = os.read();
            }

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
