package com.bjpowernote.map;

import java.util.ResourceBundle;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 16:45
 */
public class Test06 {
    public static void main(String[] args) {
        //创建ResourceBundle对象, 调用抽象类ResourceBundle的静态方法getBundle()来创建.
        //注意: 使用ResourceBundle时, 配置文件不需要扩展名
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/resource/config");
        //读取属性
        System.out.println( resourceBundle.getString("username"));
        System.out.println(resourceBundle.getString("password"));
        System.out.println( resourceBundle.getString("用户名"));
    }
}
