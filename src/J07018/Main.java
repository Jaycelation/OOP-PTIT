package J07018;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        int cnt = 1;
        while (n-- > 0) {
            list.add(new SinhVien( "B20DCCN" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine())));
        }
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
