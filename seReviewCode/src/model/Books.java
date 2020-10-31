package model;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/28 10:16
 */
public class Books {
    private String booksID ;
    private String booksName;
    private String author;
    private double price;

    public Books() {
    }

    public Books(String booksID, String booksName, String author, double price) {
        this.booksID = booksID;
        this.booksName = booksName;
        this.author = author;
        this.price = price;
    }

    public String getBooksID() {
        return booksID;
    }

    public Books setBooksID(String booksID) {
        this.booksID = booksID;
        return this;
    }

    public String getBooksName() {
        return booksName;
    }

    public Books setBooksName(String booksName) {
        this.booksName = booksName;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Books setAuthor(String author) {
        this.author = author;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Books setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Books{" +
                "booksID='" + booksID + '\'' +
                ", booksName='" + booksName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Double.compare(books.price, price) == 0 &&
                Objects.equals(booksID, books.booksID) &&
                Objects.equals(booksName, books.booksName) &&
                Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booksID, booksName, author, price);
    }
}
