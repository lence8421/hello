package com.bjpowernode.dirtyread;

import java.util.Random;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/29 10:23
 */
public class MyValue {
    private String name;
    private String password;

    public MyValue() {
    }

    public MyValue(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void getData(){
        System.out.println("name=" + name + ", password = " + password);
    }

    public void setData(String name,String password){
        this.name = name;
        try {
            Thread.sleep(new Random().nextInt(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password = password;
    }
}
