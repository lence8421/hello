package com.bjpowernote.reflest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/30 14:47
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        final Class<String> aClass = String.class;
        //2) 实例方法需要先创建对象
       final String s1 = aClass.newInstance();
        //反射String(byte[])构造方法
        Constructor<String> constructor = aClass.getConstructor(byte[].class);
        byte[] bytes = {65,66,67,68,69,70};
        final String s2 = constructor.newInstance(bytes);
        System.out.println(s1);
        System.out.println(s2);
        //3)调用getMethod(方法名, 形参列表)返回某个 方法, 如果方法没有参数则形参列表可以省略
        Method length = aClass.getMethod("length");
        Object result = length.invoke(s1);
        System.out.println(result);
        result = length.invoke(s2);
        System.out.println(result);
        //4) 调用方法,  method.invoke(实例名, 实参列表)

    }
}
