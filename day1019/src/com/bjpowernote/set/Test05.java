package com.bjpowernote.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 16:56
 */
public class Test05 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        treeSet.add(new Student("zhangsan",15));
        treeSet.add(new Student("lisi",19));
        treeSet.add(new Student("wangwu",13));
        treeSet.add(new Student("chengqi",18));
        treeSet.add(new Student("ergouzi",25));
        treeSet.add(new Student("zhaoliu",14));
        //System.out.println(treeSet );

        for (Student student : treeSet) {
            System.out.println(student);
        }
        System.out.println("-----------------------");
        TreeSet<Student> treeSet2 = new TreeSet<>();
        treeSet2.addAll(treeSet);

        for (Student student : treeSet2) {
            System.out.println(student);
        }
    }
}
