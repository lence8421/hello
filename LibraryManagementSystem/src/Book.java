import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/31 8:54
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 4937977710938623008L;

    // ISBN编号
    private String isbnNum;

    // 书名
    private String bookName;

    // 作者
    private String author;

    // 价格
    private double price;

    public Book() {
    }

    public Book(String isbnNum, String bookName) {
        this.isbnNum = isbnNum;
        this.bookName = bookName;
    }

    public Book(String isbnNum, String bookName, String author, double price) {
        this.isbnNum = isbnNum;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(isbnNum, book.isbnNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbnNum, bookName);
    }

    @Override
    public String toString() {
        return "ISBN编号: " + isbnNum + "  " + "书名: " + bookName + "  " +"作者: " +  author +"  "+ "价格: " + price;
    }

    public String getIsbnNum() {
        return isbnNum;
    }

    public void setIsbnNum(String isbnNum) {
        this.isbnNum = isbnNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

