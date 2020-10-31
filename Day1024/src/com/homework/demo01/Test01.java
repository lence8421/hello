package com.homework.demo01;

import java.io.File;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/25 17:18
 */
public class Test01 {
    //定义方法把指定文件夹的内容显示出来,包括子文件夹的内容
    public static void main(String[] args) {
        //1) 创建File对象, 通过构造方法指定要关联哪个文件
        File file = new File("D:\\javaSECode\\javasexxx");
        display(file);
    }
    public static void display(File file){
        //查看文件夹内容
        File[] list = file.listFiles();
        for (File file1 : list) {
            if (!file1.isDirectory()) {
                System.out.println(file1.getName());
            }else {
                System.out.println(file1.getName() + "：子文件内容");
                display(file1);
            }
        }



    }
}

