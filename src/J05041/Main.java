package J05041;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            String id = "NV" + String.format("%02d", cnt++);
            String tenNV = scanner.nextLine();
            int luongCB = Integer.parseInt(scanner.nextLine());
            int soNgayCong = Integer.parseInt(scanner.nextLine());
            String chucVu = scanner.nextLine();
            listNV.add(new NhanVien(id, tenNV, luongCB, soNgayCong, chucVu));
        }

        listNV.sort(Comparator.comparing(NhanVien::thuNhap).reversed());
        for (NhanVien nv : listNV) {
            System.out.println(nv);
        }
    }
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
 */
