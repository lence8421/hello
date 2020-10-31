package com.homework.demo01;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 15:42
 * 	定义测试类
 * 		创建公司对象
 * 		添加10个员工
 * 		显示 所有员工信息
 * 		判断是否存在zhangsan
 * 		删除lisi
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        //company.peopleNum = 50;
        company.employee = new Employee("12000035","二狗子",12,2500);
        //调用company.addEmployee方法 添加 10个员工
        Employee [] 接收 = company.addEmployee(new Employee("12000035","二狗子",12,2500),
                                                new Employee("12000035","小花",32,2300),
                                                new Employee("12000035","丽丽",12,2500),
                                                new Employee("12000035","开阿凯",52,25000),
                                                new Employee("12000035","阿卡丽",22,2500),
                                                new Employee("12000035","钢铁侠",112,2500),
                                                new Employee("12000035","灭霸",1223,2500000),
                                                new Employee("12000035","沙雕",15,2500),
                                                new Employee("12000035","三愣子",18,25010));
        /*for (int i = 0; i < xxxx.length; i++) {
            System.out.print(xxxx[i]);
        }
        System.out.println(xxxx);*/

        System.out.println(company.employee);
        System.out.println(接收);
       // company.sx(xxxx);
        //判断啊 小花是否存在；
        company.isExist("小花");
    }
}
