package model;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/30 10:30
 */
public class Usre {
    private String name;
    private String password;

    public Usre() {
    }

    public Usre(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Usre setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Usre setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usre usre = (Usre) o;
        return Objects.equals(name, usre.name) &&
                Objects.equals(password, usre.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "Usre{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
