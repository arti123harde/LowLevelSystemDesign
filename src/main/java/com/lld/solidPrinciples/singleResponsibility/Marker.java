package com.lld.solidPrinciples.singleResponsibility;

/**
 * @author Arti Harde
 */
public class Marker {

    public String name;
    public String color;
    public int price;
    public int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
