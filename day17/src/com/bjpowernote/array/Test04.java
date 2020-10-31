package com.bjpowernote.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/15 10:58
 */
public class Test04 {
    public static void main(String[] args) {
        //1）定义数组。存放20个person对象
        Person[] array = new Person[20];
        int size = 0;
        Person p1 = new Person("丽丽",21);
        array[size++] = p1;
        array[size++] = new Person("小红",32);
        array[size++] = new Person("大花",22);
        array[size++] = new Person("x沫",26);
        array[size++] = new Person("萨达",25);
        array[size++] = new Person("淀粉",29);
        array[size++] = new Person("鬼",30);
/*
        Arrays.sort(array, 0, size, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.age-t1.age;
            }
        });*/

        for (int i = 0; i < size ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------------------");
        Arrays.sort(array,0,size);
        System.out.println();
        for (int i = 0; i < size ; i++) {
            System.out.println(array[i]);
        }
    }
}
