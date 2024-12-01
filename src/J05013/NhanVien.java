package J05013;


import java.util.*;
import java.io.*;

public class NhanVien {
    private String ma, hoTen;
    private double diemLT, diemTH;
    private String trangThai;

    public NhanVien(String ma, String hoTen, double diemLT, double diemTH) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public double diemThi() {
        double diemThi = (diemLT + diemTH) / 2;
        if (diemThi == 10) {
            return diemThi;
        }
        return diemThi /= 10;
    }

    public double getDiemThi() {
        return diemThi();
    }

    @Override
    public String toString() {
        double diemThi = diemThi();
        if (diemThi > 9.5) {
            trangThai = "XUAT SAC";
        } else if (diemThi >= 8 && diemThi <= 9.5) {
            trangThai = "DAT";
        } else if (diemThi > 5 && diemThi < 8) {
            trangThai = "CAN NHAC";
        } else {
            trangThai = "TRUOT";
        }
        return ma + " " + hoTen + " " + String.format("%.2f", diemThi()) + " " + trangThai;
    }
}
