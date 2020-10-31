package com.bjpowernode.io.fileinout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 21:15
 */
public class Test05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\javaSEProjects\\abc.txt");
            int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
