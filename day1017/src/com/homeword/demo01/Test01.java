package com.homeword.demo01;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/18 21:54
 * 1 创建Collection集合,存储Student对象
 * 	向集合中添加5个Student对象
 * 	判断集合中是否包含指定的Student对象
 * 	判断集合中是否包含指定姓名的同学
 * 	删除集合中成绩小于60的同学
 * 	遍历集合中的所有对象
 */
public class Test01 {
    public static void main(String[] args) {
        //创建Collection集合,存储Student对象
        Collection<Student> comparable = new ArrayList<>();
        //	向集合中添加5个Student对象
        comparable.add(new Student("二狗子",60));
        comparable.add(new Student("花花",90));
        comparable.add(new Student("廉颇",80));
        comparable.add(new Student("诸葛村夫",70));
        comparable.add(new Student("花木兰",40));
        comparable.add(new Student("熊大",90));
        //	判断集合中是否包含指定姓名的同学
        /*for (Iterator<Student> studentIterator = comparable.iterator(); studentIterator.hasNext(); ) {
            Student next =  studentIterator.next();
            if ("二狗子".equals(next.getName())){
                System.out.println(true);
            }
            }*/
        String name = "花木兰";
        boolean exist = false;//定义标识表示是否存在，先假设不存在

        for (Student student : comparable) {
            if (name.equals(student.getName())){
                exist = true;
                break;
            }
        }
        if (exist){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

        // 删除集合中成绩小于60的同学
        for (Iterator<Student> iterator = comparable.iterator(); iterator.hasNext(); ) {
            Student next =  iterator.next();
           if (next.getGrade() <= 60){
               iterator.remove();
           }
        }
        // 遍历集合中的所有对象
        for (Student student : comparable) {
            System.out.println(student);
        }
        }

    }

