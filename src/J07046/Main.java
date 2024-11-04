package J07046;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 20:46 by jayce
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Customer> listC = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String idC = "KH" + String.format("%02d", i+1);
            String name = scanner.nextLine();
            String idR = scanner.nextLine();
            String dateS = scanner.nextLine();
            String dateE = scanner.nextLine();
            listC.add(new Customer(idC, name, idR, dateS, dateE));
        }
        listC.sort(Comparator.comparing(Customer::getD).reversed());
        for (Customer c : listC) {
            System.out.println(c);
        }
    }
}
