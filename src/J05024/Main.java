package J05024;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (n-- > 0) {
            listSV.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String nganhSV = scanner.nextLine().trim().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganhSV + ":");
            for (SinhVien s : listSV) {
                if (nganhSV.equals(s.getNganhSV())) {
                    System.out.println(s);
                }
            }
        }

    }
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Ke toan
 */