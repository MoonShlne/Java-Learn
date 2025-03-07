package com.myself04.compare;

/**
 * @author shkstart
 * @create 11:45
 */
public class Product implements Comparable { //商品类

    private String name;//商品名称
    private double price;//价格

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Product) {
            Product p = (Product) o;
            int value = Double.compare(this.price, p.price);
            if (value != 0) {
                return value;
            }
        }

        return this.name.compareTo(name);
    }
}
