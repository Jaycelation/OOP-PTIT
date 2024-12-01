package J05009;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String tenSinhVien, ngaySinh;
    private double diemThi;
    private int id;

    public SinhVien(int id, String tenSinhVien, String ngaySinh, double diemThi) {
        this.id = id;
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.diemThi = diemThi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public double getDiemThi() {
        return diemThi;
    }

    @Override
    public String toString() {
        return id + " " + tenSinhVien + " " + ngaySinh + " " + diemThi;
    }
}
