package J05014;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        ArrayList<GiaoVien> listGV = new ArrayList<>();
        while (n-- > 0) {
            String maGV = "GV" + String.format("%02d", cnt);
            cnt++;
            String tenGV = scanner.nextLine();
            String maXT = scanner.nextLine();
            double diemTin = Double.parseDouble(scanner.nextLine());
            double diemCM = Double.parseDouble(scanner.nextLine());
            double tongDiem = diemCM + diemTin * 2;
            int uuTien = Integer.parseInt(String.valueOf(maXT.charAt(1)));
            if (uuTien == 1) {
                tongDiem += 2.0;
            } else if (uuTien == 2) {
                tongDiem += 1.5;
            } else if (uuTien == 3) {
                tongDiem += 1.0;
            } else if (uuTien == 4) {
                tongDiem += 0.0;
            }
            String trangThai = "";
            if (tongDiem >= 18) {
                trangThai = "TRUNG TUYEN";
            } else {
                trangThai = "LOAI";
            }
            listGV.add(new GiaoVien(maGV, tenGV, maXT, tongDiem, trangThai));
        }

        listGV.sort(Comparator.comparing(GiaoVien::getTongDiem).reversed());
        for (GiaoVien gv : listGV) {
            System.out.println(gv);
        }

    }
}
/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
 */