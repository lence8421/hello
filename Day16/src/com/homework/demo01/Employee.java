package com.homework.demo01;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/14 15:41
 * 定义Employee员工类, 有编号, 姓名, 年龄,工资等属性
 */
public class Employee {
    //员工类的属性
    String id;
    String name;
    int age;
    double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }


    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
