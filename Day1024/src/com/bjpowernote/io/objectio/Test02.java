package com.bjpowernote.io.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.InflaterInputStream;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 12:12
 * 反序列化
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\javaSECode\\javasexxx\\abc.txt"));

        //反序列化
        Object obj = ois.readObject();

        ois.close();

        System.out.println(obj);
    }
}
