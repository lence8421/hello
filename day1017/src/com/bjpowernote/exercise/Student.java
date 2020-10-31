package com.bjpowernote.exercise;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/17 11:36
 */
public class Student {
    int id;
    public String name;
    double grade;

    public Student(String 二狗子, int i) {
    }

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
