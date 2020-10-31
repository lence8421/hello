package com.bjpowernote.stringxxx;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/16 12:15
 */
public class Test03 {
    public static void main(String[] args) {
        //!.创建StringBuilder
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);

        //字符串连接
        sb.append("1213125");
        sb.append("word" );
        System.out.println(sb);

        //删除
        sb.delete(0,5);
        System.out.println(sb);

        //插入
        sb.insert(3,"hehe");
        System.out.println(sb);

        //逆序
        sb.reverse();
        System.out.println(sb);
    }
}
