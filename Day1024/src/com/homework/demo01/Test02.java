package com.homework.demo01;

import java.io.File;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 9:21
 */
public class Test02 {
    public static void main(String[] args) {
     //   deleteFolder("D:\\javaSECode\\javasexxx");
    }
    public static void deleteFolder(String foder){
        //根据路径创建File对象
        File dir = new File(foder);

        File[] listFiles = dir.listFiles();//列出文件夹的内容
        for (File f : listFiles) {
            if (f.isFile()){
                f.delete();
            }else {
                //内容是子文件夹，调用递归用删除子文件夹
                deleteFolder(f.getAbsolutePath());
            }
        }
        dir.delete();
    }
}
