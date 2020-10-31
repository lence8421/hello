package com.bjpowernote.set;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 16:51
 */
public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Student student) {
        return 1;
    }
}
