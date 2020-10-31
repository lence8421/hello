package com.homework.demo01;
/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 15:42
 * 定义Company公司类
 * 公司有若干的员工 ,  使用数组保存员工信息
 * 定义方法添加员工, 通过参数接收一个员工, 把该员工保存到数组中
 * 定义方法显示所有的员工
 * 定义方法判断指定姓名的员工是否存在
 * 定义方法删除指定姓名的员工
 */
public class Company {
    Employee employee;
    //定义方法添加员工, 通过参数接收一个员工, 把该员工保存到数组中
    //定义一个数组s
    int peopleNum;
    Employee [] s = new Employee[peopleNum];//初始化员工规模
    public Employee[] addEmployee(Employee...employee){
        Employee [] x = new Employee[employee.length];//传过来的形成新的数组
        Employee [] y = new Employee[(employee.length+peopleNum)*2];//创建一个足够大的数组
        System.arraycopy(s,0,y,0,s.length);//复制 原有的数组
        System.arraycopy(x,0,y,getNum(s),x.length);//添加后传过来的数组
        /*for (int i = 0; i < employee.length; i++) {
            s[getNum(s)+i] = employee[i];
        }*/

        return s = y;
    }

    public int getNum(Employee[] s) {
        System.out.println("执行了getNum（）");

        for ( int i = 0; i < s.length; i++) {
            if (s[i] == null){
                return i;
            }
        }
        return 0;
    }

    //定义方法显示所有的员工
    public void sx(Employee[] x){
        for (Employee x1 : x) {
            if (x1 == null){
                return;
            }
            System.out.println(x1.toString());
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee.toString() +
                ", peopleNum=" + peopleNum +
                ", s=" +  +
                '}';
    }

    //定义方法判断指定姓名的员工是否存在
    public boolean isExist(String name){
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null){
                System.out.println("没有元素！！！！！");
                break;
            }
            if(name.equals(s[i].name)){
                return true;
            }
        }
        return false;
    }

    //定义方法删除指定姓名的员工
    public void delEmployee(String name){
        if(name.equals(employee.name)){
          //  String [] bigger = new String[];
        }

    }
}
