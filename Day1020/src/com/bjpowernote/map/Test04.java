package com.bjpowernote.map;

import java.util.Map;
import java.util.Properties;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/20 16:48
 */
public class Test04 {
    public static void main(String[] args) {
        //1) 创建Properties
        Properties properties = new Properties();

        //2）设置属性
        properties.setProperty("uesrname","bjpowernode");
        properties.setProperty("password","8888");

        //4)读取属性值
        properties = System.getProperties();
        for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
            System.out.println(objectObjectEntry);
        }
    }
}
