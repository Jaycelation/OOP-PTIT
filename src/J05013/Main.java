package J05013;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        int count = 1;
        while (n-- > 0) {
            String id = "TS" + String.format("%02d", count);
            count++;
            String hoTen = scanner.nextLine();
            double diemLT = Double.parseDouble(scanner.nextLine());
            if (diemLT < 10) {
                diemLT *= 10;
            }
            double diemTH = Double.parseDouble(scanner.nextLine());
            if (diemTH < 10) {
                diemTH *= 10;
            }
            listNV.add(new NhanVien(id, hoTen, diemLT, diemTH));
        }
        listNV.sort(Comparator.comparing(NhanVien::getDiemThi).reversed());
        for (NhanVien nv : listNV) {
            System.out.println(nv);
        }

    }
}
/*
3
Nguyen Thai Binh
45
75
Le Cong Hoa
4
4.5
Phan Van Duc
56
56
 */