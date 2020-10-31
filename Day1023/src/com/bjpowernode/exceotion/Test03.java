package com.bjpowernode.exceotion;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 11:00
 */
public class Test03 {
    public static void main(String[] args){
        convertTOBytes("动力节点是最牛b的java培训机构","UTF8");
        convertTOBytes("动力节点是最牛b的java培训机构","GB23k");
        convertTOBytes("动力节点是最牛b的java培训机构","GB2312");
        System.out.println("main方法最后一行代码执行了！！！！");
    }

    private static void convertTOBytes(String text, String charsetName)  {
        try {
            byte[] bytes = text.getBytes(charsetName);
            System.out.println(Arrays.toString(bytes));

        }catch (UnsupportedEncodingException e ){
            e.printStackTrace();
        }
    }
}
