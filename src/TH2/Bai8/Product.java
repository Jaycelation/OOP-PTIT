package Bai8;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 14:26 by jayce
 */

public class Product {
    private String id, name;
    private int price, warranty;

    public Product(String id, String name, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }
}
