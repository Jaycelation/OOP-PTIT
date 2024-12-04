package J05059;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (n-- > 0) {
            String maSV = scanner.nextLine();
            String tenSV = scanner.nextLine();
            double diem1 = Double.parseDouble(scanner.nextLine());
            double diem2 = Double.parseDouble(scanner.nextLine());
            double diem3 = Double.parseDouble(scanner.nextLine());
            double diemSV = diem1 * 2 + diem2 + diem3;
            listSV.add(new SinhVien(maSV, tenSV, diemSV));
        }
        n = Integer.parseInt(scanner.nextLine());
        listSV.sort(Comparator.comparing(SinhVien::getDiemSV).reversed().thenComparing(SinhVien::getMaSV));
        double diemChuan = listSV.get(n - 1).getDiemSV();
        System.out.println(String.format("%.1f", diemChuan));
        for (SinhVien sinhVien : listSV) {
            System.out.print(sinhVien);
            if (sinhVien.getDiemSV() >= diemChuan) {
                System.out.println(" TRUNG TUYEN");
            } else {
                System.out.println(" TRUOT");
            }
        }

    }
}
/*
3
KV3B333
Nguyen Anh Tu
8
6.5
7
KV2A002
Hoang Thanh Tuan
5
6
5
KV3B123
Ly Thi Thu Ha
8
6.5
7
1
 */