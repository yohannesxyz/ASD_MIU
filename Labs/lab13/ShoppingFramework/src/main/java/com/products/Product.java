package com.products;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int productNumber;
    private String name;
    private double price;
    private int stock;

    public Product(int productNumber, String name, double price) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
    }

    public Product reduceStockAfterOrder(int orderQuantity) {
        this.stock -= orderQuantity;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", name='" + name + '\'' +
                ", stock='" + stock + '\'' +
                ", price=" + price +
                '}';
    }
}
