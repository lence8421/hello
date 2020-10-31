package com.bjpowernote.company;

import java.util.Arrays;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 15:18
 * 定义员工类Employee,有姓名,年龄,工资等属性;
 * 定义公司类,公司中包含若干的员工,使用数组保存员工的信息;
 * 定义方法添加员工;
 * 定义方法显示所有员工的信息;
 * 定义方法判断是否存在指定姓名的员工;
 * 定义方法删除指定姓名的员工
 */
public class Company {
    //公司有若干员工，可以使用数组保存员工的信息
    private Employee [] data;
    //一般情况下，使用对象数组是，会定义一个变量记录数组中元素的数量
    private int size;

    //一般情况下，会在无参构造方法中给数组进行默认初始化

    public Company() {
        data = new Employee[100];
    }

    public Company(int capacity) {
        if (capacity < 0){
            data = new Employee[100];
        }else {
        data = new Employee[capacity];
        }
    }

    //定义添加方法
    public void add(Employee x){
        if (size == data.length){
            data = Arrays.copyOf(data,data.length*2);
        }
        data[size++] = x;//把对象保存到数组中
    }

    //显示员工信息
    public void showAll(){
        System.out.println("---------------------显示员工信息-----------");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    //判断是否存在指定姓名的员工
    public boolean containsName(String name){
        if ( name != null){
            for (int i = 0; i < size; i++) {
                if (data[i].getName().equals(name)){
                    return true;
                }
            }
        }else {
            //判断数组中是否存在某个员工的姓名也为null
            for (int i = 0; i < size; i++) {
                if (data[i].getName() == null){
                    return true;
                }
            }
        }
        return false;
    }

    //定义方法删除指定员姓名的员工，需要通过参数接收要删除的员工的姓名
    public void deleteByName(String name){
        //从data数组中删除姓名为name的员工对象，先确定name姓名的员工在数组中的索引值
        int index = indexof(name);
        if (index < 0){
            System.out.println("公司中不存在姓名为" + name + "的员工");
            return;
        }
        System.arraycopy(data,index + 1,data,index,data.length-index-1);
        data[--size] = null;
    }

    private int indexof(String name) {
        if ( name != null){
            for (int i = 0; i < size; i++) {
                if ( name.equals(data[i].getName())){
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
               if (data[i].getName() == null){
                   return i;
               }
            }
        }
        return -1;
    }
}
