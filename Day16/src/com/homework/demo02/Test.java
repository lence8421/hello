package com.homework.demo02;



/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 21:02
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();

        //向公司中添加员工
        company.add(new Employee());
        company.add(new Employee());
        company.add(new Employee("lisi", 25, 5000.0));
        company.add(new Employee("zhangsan", 65, 9000.0));
        company.add(new Employee("wangwu", 55, 4000.0));
        company.add(new Employee("zhaoliu", 35, 7000.0));
        company.add(new Employee("chenqi", 45, 8000.0));
        company.add(new Employee("yangfei", 75, 6000.0));

        //显示公司所有的员工
        company.showAll();

        //判断
        System.out.println( company.containsByName("lisi"));
        System.out.println( company.containsByName("wangqi"));
        System.out.println( company.containsByName( null ));

        //删除
        company.deleteByName(null);
        company.showAll();

        //根据年龄升序排序
        company.sortByAge();
        company.showAll();
        //根据工资降序排序
        company.sortBySalaryDesc();
        company.showAll();
    }
}
