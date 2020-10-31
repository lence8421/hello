package com.bjpowernode.io.fileinout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 16:43
 */
public class Test04 {
    public static <bytes> void main(String[] args) {
        //1)在当前程序与写入文件之间建立 流通到，通过FileOutputStream流可以把字节写入文件中；
        try
            (FileOutputStream fos = new FileOutputStream("D:\\javaSEProjects\\abc.txt",true)){//添加一个boolean追加，不覆盖原来文件的内容
            fos.write(94);//write 一次写入一个字节
            fos.write(94);
            fos.write(94);
            fos.write(94);
            fos.write(194);
            byte[] bytes = {66,88,99,77};
            fos.write(bytes);

            byte[] bytes1 = {99,99,99,99,99,99,9,55};
            fos.write(bytes1,0,5);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
