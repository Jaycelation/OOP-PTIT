package J07010;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("src/J07010/SV.in"));
        int n = scanner.nextInt();
        sinhVien[] sv = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            sv[i] = new sinhVien("B20DCCN" + String.format("%03d", i + 1), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
        }
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}
