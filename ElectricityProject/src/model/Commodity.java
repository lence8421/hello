package model;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/30 9:38
 * 商品类
 */
public class Commodity {
    private String number;
    private String name;
    private int price;
    private int sales;

    public Commodity() {
    }

    public Commodity(String number, String name, int price, int sales) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.sales = sales;
    }

    public String getNumber() {
        return number;
    }

    public Commodity setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getName() {
        return name;
    }

    public Commodity setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Commodity setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getSales() {
        return sales;
    }

    public Commodity setSales(int sales) {
        this.sales = sales;
        return this;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return price == commodity.price &&
                sales == commodity.sales &&
                Objects.equals(number, commodity.number) &&
                Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, price, sales);
    }
}
