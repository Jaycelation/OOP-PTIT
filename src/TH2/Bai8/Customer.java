package Bai8;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 14:25 by jayce
 */

public class Customer {
    private String idC, name, address, idP, date;
    private int count;
    private Product product;
    public Customer(String idC, String name, String address, String idP, int count, String date, Product product) {
        this.idC = idC;
        this.name = name;
        this.address = address;
        this.idP = idP;
        this.date = date;
        this.count = count;
        this.product = product;
    }

    public String getIdC() {
        return idC;
    }

    public int cost() {
        return product.getPrice() * count;
    }

    public String dateEnd() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate exp = LocalDate.parse(date, formatter);
        LocalDate exp1 = exp.plusMonths(product.getWarranty());
        return exp1.format(formatter);
    }

    @Override
    public String toString() {
        return idC + " " + name + " " + address + " " + idP + " " + cost() + " " + dateEnd();
    }
}
