package com.bjpowernote.io.dataio;

import java.io.*;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 10:44
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1)建立流通到
       DataInputStream dos = new DataInputStream(new FileInputStream("D:\\javaSEProjects\\jk.txt"));
        //
        System.out.println(dos.readInt());
        System.out.println(dos.readInt());
        System.out.println(dos.readDouble());
        System.out.println(dos.readBoolean());
        System.out.println(dos.readUTF());


        dos.close();
    }
}
