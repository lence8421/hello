package com.bjpowernote.io.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 11:41
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Person p = new Person("lisi", 25,"nan","2121312");

        //建立流通道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\javaSECode\\javasexxx\\abc.txt"));

        //序列化就是把p对象保存到文件中, 这个文件直接打开会显示乱码, 该文件内容需要通过ObjectInputStream流读取
        oos.writeObject(p);

        //关闭流
        oos.close();
    }
}
