package com.bjpowernote.io.filerw;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 15:27
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        fos = new FileOutputStream("D:\\javaSECode\\javasexxx\\gbks.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos , "GBK");

        osw.write("这是在UTF8编码环境中 写入的字符串");

        osw.close();
    }
}
