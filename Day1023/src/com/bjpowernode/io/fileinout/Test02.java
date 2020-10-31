package com.bjpowernode.io.fileinout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 15:49
 */
public class Test02 {
    public static void main(String[] args) {
        m1();
        m2();
    }

    public static void m2() {
       //从jdk7 开始 ，IO流可以自动 关闭，增加了try资源库，在try资源快中的资源会自动释放；
        try ( FileInputStream inputStream = new FileInputStream ("D:\\javaSEProjects\\abc.txt"))
        {
            int xx = inputStream.read();
            while (xx != -1) {
                System.out.println((char) xx);
                xx = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void m1() {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\javaSEProjects\\abc.txt");
            int xx = inputStream.read();
            while (xx != -1){
                System.out.println((char)xx);
                xx = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if ( inputStream != null)
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
