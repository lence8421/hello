package com.bjpowernote.map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 16:34
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //1）创建properties对象
        Properties properties = new Properties();
        //2)加载配置文件
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/resource/config" +
                ".properties");

        properties.load(in);

        //3）读取配置文件的属性
        System.out.println( properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.get("用户名"));
    }
}
