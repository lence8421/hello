package com.homeword.demo01;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/18 22:01
 */
public class Student {
    private String name;
    private int grade;

    public Student() {
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}
