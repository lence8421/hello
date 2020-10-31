package com.bjpowernode.io.fileinout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 16:23
 */
public class Test03 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\javaSEProjects\\abc.txt");
            byte[] byters = new byte[4];
            int read = inputStream.read(byters);
            while (read != -1){
                String str = new String(byters,0,read);
                System.out.println(str);
                read = inputStream.read(byters);
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
