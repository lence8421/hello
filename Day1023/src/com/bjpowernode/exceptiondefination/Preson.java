package com.bjpowernode.exceptiondefination;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 14:45
 */
public class Preson {
    private String name;
    private int age;
    private char gender;

    public Preson() {
    }

    public Preson(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preson preson = (Preson) o;
        return age == preson.age &&
                gender == preson.gender &&
                Objects.equals(name, preson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public String getName() {
        return name;
    }

    public Preson setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Preson setAge(int age) {
        this.age = age;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public Preson setGender(char gender) {
        this.gender = gender;
        return this;
    }
}
