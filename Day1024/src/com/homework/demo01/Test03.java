package com.homework.demo01;

import java.io.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/26 9:41
 * 定义方法时间文件夹的复制
 */
public class Test03 {
    public static void main(String[] args) {

    }
    //定义方法实现文件夹的复制
    public static void copyFolder(String srcFolder , String destFoldrer){
        //1)如果原文件夹不存在，不需要复制
        File srcDir = new File(srcFolder);
        if (!srcDir.exists()){
            System.out.println("源文件不存在，无需复制！！！");
            return;
        }
        //2）如过目标文件夹不存在，就创建一个文件夹
        File destDir = new File(destFoldrer);
        if (!destDir.exists()){
            destDir.mkdirs();
        }
        //3）遍历原文件夹的内容，把这些内容复制到目标文件中
        File[] listFiles = srcDir.listFiles();
        if (listFiles == null) {
            for (File listFile : listFiles) {
                File destFile = new File(destFoldrer, listFile.getName());
                //如果源文件中的内容是文件则直接复制
                if ( listFile.isFile() ){
                    copyFile( listFile, destFile );
                }else {
                    //源文件夹内容是子文件夹, 递归调用
                    copyFolder(listFile.getAbsolutePath(), destFile.getAbsolutePath());
                }
            }
        }
    }
    public static void copyFile(File srcFile, File destFile){
        try (
                FileInputStream fis = new FileInputStream(srcFile);
                FileOutputStream fos = new FileOutputStream(destFile)
        ){
            byte [] bytes = new byte[1024*8];
            int len = fis.read(bytes);
            while ( len != -1 ){
                fos.write(bytes, 0, len);
                len = fis.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
