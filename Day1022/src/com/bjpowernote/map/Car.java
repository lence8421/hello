package com.bjpowernote.map;

import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/22 10:41
 */
public class Car {
    String brand;
    String color;
    int price;

    public Car() {
    }

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, price);
    }
}
