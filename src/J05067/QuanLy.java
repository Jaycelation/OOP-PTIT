package J05067;


import java.util.*;
import java.io.*;

public class QuanLy {
    private String id, ma, ten;
    private long donGia, thue, thanhTien;

    public QuanLy(String ma, int soLuong) {
        this.ma = ma;
        this.id = ma.substring(0, 1);
        String temp = ma.substring(ma.length()-2);
        if (temp.equals("BP")) {
            this.ten = "British Petro";
        } else if (temp.equals("ES")) {
            this.ten = "Esso";
        } else if (temp.equals("SH")) {
            this.ten = "Shell";
        } else if (temp.equals("CA")) {
            this.ten = "Castrol";
        } else if (temp.equals("MO")) {
            this.ten = "Mobil";
        } else {
            this.ten = "Trong Nuoc";
        }

        if (id.equals("X")) {
            donGia = 128000;
        } else if (id.equals("D")) {
            donGia = 11200;
        } else if (id.equals("N")) {
            donGia = 9700;
        }

        if (id.equals("X")) {
            thue = donGia * soLuong * 3 / 100;
        } else if (id.equals("D")) {
            thue = donGia * soLuong * 35 / 1000;
        } else if (id.equals("N")) {
            thue = donGia * soLuong *  2 / 100;
        }
        if (ten.equals("Trong Nuoc")) {
            thue = 0;
        }
        thanhTien = donGia * soLuong + thue;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donGia + " " + thue + " " + thanhTien;
    }
}
