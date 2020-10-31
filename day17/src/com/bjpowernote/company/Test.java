package com.bjpowernote.company;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 15:19
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();

        //向公司中添加员工

        company.add(new Employee(1002,"lisi", 25, 5000.0));
        company.add(new Employee(1003,"zhangsan", 65, 9000.0));
        company.add(new Employee(1004,"wangwu", 55, 4000.0));
        company.add(new Employee(1005,"zhaoliu", 35, 7000.0));
        company.add(new Employee(1006,"chenqi", 45, 8000.0));
        company.add(new Employee(1006,"yangfei", 75, 6000.0));
        company.add(new Employee());
        company.add(new Employee());
        //显示公司所有的员工
        company.showAll();

        //判断员工指定员工是否存在
        System.out.println(company.containsName("zhangsan"));
        //判断某个员工对象的姓名也是null
        System.out.println(company.containsName(null));
        //删除指定姓名的员工对象
        company.deleteByName("wangwu");
        company.showAll();
        //删除姓名为 null 的员工对象
        while (company.containsName(null)){
            company.deleteByName(null);
        }
        company.showAll();
    }
}
