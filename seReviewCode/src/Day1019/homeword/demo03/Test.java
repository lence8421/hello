package Day1019.homeword.demo03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 19:25
 * 3 定义Student类,有学号, 班级, 成绩三个字段
 * 创建Set集合, 保存20个Student对象, 每个对象的属性随机生成, 要求集合中Student对象的学号中唯一的
 * 遍历集合, 找出最高分,最低分同学的信息
 */
public class Test {
    public static void main(String[] args) {
        //创建TreeSet
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.id - t1.id;
            }
        });

    }
}
