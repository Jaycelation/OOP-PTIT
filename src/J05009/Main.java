package J05009;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        int id = 1;
        while (n -- > 0) {
            String tenSinhVien = scanner.nextLine();
            String ngaySinh = scanner.nextLine();
            double diemMon1 = Double.parseDouble(scanner.nextLine());
            double diemMon2 = Double.parseDouble(scanner.nextLine());
            double diemMon3 = Double.parseDouble(scanner.nextLine());
            double diemThi = diemMon1 + diemMon2 + diemMon3;
            listSV.add(new SinhVien(id, tenSinhVien, ngaySinh, diemThi));
            id++;
        }
        double total = 0.0;
        for (SinhVien sv : listSV) {
            total = Math.max(total, sv.getDiemThi());
        }

        for (SinhVien sv : listSV) {
            if (sv.getDiemThi() == total) {
                System.out.println(sv);
            }
        }

    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
 */