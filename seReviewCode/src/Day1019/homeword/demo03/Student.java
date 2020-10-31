package Day1019.homeword.demo03;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/19 22:17
 */
public class Student {
    //有学号, 班级, 成绩三个字段
    int id;
    int grade;
    int score;

    public Student() {
    }

    public Student(int id, int grade, int score) {
        this.id = id;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
