package model;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/28 15:49
 */
public class Administrator {
    private String admName;
    private String possword;

    public Administrator() {
    }

    public Administrator(String admName, String possword) {
        this.admName = admName;
        this.possword = possword;
    }

    public String getAdmName() {
        return admName;
    }

    public Administrator setAdmName(String admName) {
        this.admName = admName;
        return this;
    }

    public String getPossword() {
        return possword;
    }

    public Administrator setPossword(String possword) {
        this.possword = possword;
        return this;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "admName='" + admName + '\'' +
                ", possword='" + possword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrator that = (Administrator) o;
        return Objects.equals(admName, that.admName) &&
                Objects.equals(possword, that.possword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admName, possword);
    }
}
