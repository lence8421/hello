package com.bjpowernote.array;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 11:46
 */
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person x) {
        return this.name.compareTo(x.name);
    }
}
