package J07033;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException , FileNotFoundException{
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (n-- > 0) {
            listSV.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        listSV.sort(Comparator.comparing(SinhVien::getMaSV));
        for (SinhVien sv : listSV) {
            System.out.println(sv);
        }
    }
}