import java.util.*;
import java.io.*;

public class J05036 {
    public static class CuaHang {
        private String maMH, tenMH, donVi;
        private double donGia, soLuong, phiVC, thanhTien, giaBan;

        public CuaHang(String maMH, String tenMH, String donVi, int donGia, int soLuong) {
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.donVi = donVi;
            this.donGia = donGia;
            this.soLuong = soLuong;

            this.phiVC = donGia * soLuong * 5 / 100;
            this.thanhTien = donGia * soLuong + phiVC;
            this.giaBan = thanhTien + thanhTien * 2 / 100;
        }

        @Override
        public String toString() {
            return maMH + " " + tenMH + " " + donVi + " " + String.format("%.0f %.0f %.0f", phiVC , thanhTien ,giaBan);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CuaHang> list = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            list.add(new CuaHang("MH" + String.format("%02d", cnt++), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }

        for (CuaHang c : list) {
            System.out.println(c);
        }

    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
 */