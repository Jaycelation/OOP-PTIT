package J07053;


import java.util.*;
import java.io.*;

/**
 * Create on 09/10/2024 13:35 by jayce
 */

public class PH {
    private String id, ten, ngaySinh;
    private double diemLt, diemTh;

    public PH(String id, String ten, String ngaySinh, double diemLt, double diemTh) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemLt = diemLt;
        this.diemTh = diemTh;
    }

    public PH() {
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public double getDiemLt() {
        return diemLt;
    }

    public double getDiemTh() {
        return diemTh;
    }

    public int getTuoi(String ngaySinh) {
        int result = Integer.parseInt(ngaySinh.substring(6));
        return result;
    }

    public double getDiem(double diemLt, double diemTh) {
        double result = 0;

        if (diemLt >= 8 && diemTh >= 8) {
            result += 1;
        }
        if (diemLt >= 7.5 && diemTh >= 7.5) {
            result += 0.5;
        }
        result = (diemLt + diemTh)/2;
        if (result > 10) {
            result = 10;
        }
        return result;
    }

    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + getTuoi(this.ngaySinh) + " " + "";
    }
}
