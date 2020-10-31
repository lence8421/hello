package com.bjpowernote.io.objectio;

import java.io.Serializable;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/24 12:08
 */
public class Person implements Serializable {
    String name;
    int age;
    String gender;
    String personId;

    public Person() {
    }

    public Person(String name, int age, String gender, String personId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", personId='" + personId + '\'' +
                '}';
    }
}
