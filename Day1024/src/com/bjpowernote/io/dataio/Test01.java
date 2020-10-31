package com.bjpowernote.io.dataio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 10:37
 */
public class Test01 {
    public static void main(String[] args) {
        //演示使用DataOutStream把数据保存到文件中

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\javaSEProjects\\jk.txt");

            DataOutputStream dos = new DataOutputStream(fos);

            //2)写入数据
            dos.writeInt(21);
            dos.writeInt(2);
            dos.writeDouble(2.3);
            dos.writeBoolean(true);
            dos.writeUTF("在疫情期间要注意防控");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
