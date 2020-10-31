package model;

import java.util.List;
import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/28 15:48
 */
public class User {
    private static List<Books> booksList;
    private String userID;
    private String password;

    public User() {
    }

    public User(String userID, String password, List<Books> booksList) {
        this.userID = userID;
        this.password = password;
        this.booksList = booksList;
    }

    public String getUserID() {
        return userID;
    }

    public User setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public User setBooksList(List<Books> booksList) {
        this.booksList = booksList;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", booksList=" + booksList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, password);
    }
}
