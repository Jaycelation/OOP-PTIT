package Bai8;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 14:25 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("src/Bai8/MUAHANG.in"));

        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> listP = new ArrayList<>();
        while (t-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int warranty = Integer.parseInt(sc.nextLine());
            listP.add(new Product(id, name, price, warranty));
        }

        t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> listC = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String idC = "KH" + String.format("%02d", i);
            String name = sc.nextLine();
            String address = sc.nextLine();
            String idP = sc.nextLine();
            int count = Integer.parseInt(sc.nextLine());
            String date = sc.nextLine();
            Product product = null;
            for (Product p : listP) {
                if (p.getId().equals(idP)) {
                    product = p;
                    break;
                }
            }
            listC.add(new Customer(idC, name, address, idP, count, date, product));
        }
        listC.sort(Comparator.comparing(Customer::dateEnd).thenComparing(Customer::getIdC));
        for (Customer c : listC) {
            System.out.println(c);
        }
    }
}
