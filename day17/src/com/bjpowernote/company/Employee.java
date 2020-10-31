package com.bjpowernote.company;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 15:19
 */
public class Employee  {
    private int id;
    private String name;
    private int age;
    private double salsry;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salsry) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salsry = salsry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salsry=" + salsry +
                '}';
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public double getSalsry() {
        return salsry;
    }

    public Employee setSalsry(double salsry) {
        this.salsry = salsry;
        return this;
    }
}
