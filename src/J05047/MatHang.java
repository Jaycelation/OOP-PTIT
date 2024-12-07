package J05047;


import java.util.*;
import java.io.*;

public class MatHang {
    private String maMH, tenMH;
    private int soLuong, donGia;
    private int chietKhau, thanhTien;
    public MatHang(String maMH, String tenMH, int soLuong, int donGia) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        int temp = donGia * soLuong;
        int val = 0;
        boolean check = true;
        if (soLuong > 10) {
            val = 5;
        } else if (soLuong >= 8 && soLuong <= 10) {
            val = 2;
        } else if (soLuong >= 5 && soLuong <= 8) {
            val = 1;
        } else if (soLuong < 5) {
            check = false;
        }

        if (!check || val == 0) {
            this.chietKhau = 0;
        } else {
            this.chietKhau = temp * val / 100;
        }
        this.thanhTien = temp - this.chietKhau;
    }

    public int getChietKhau() {
        return chietKhau;
    }


    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + chietKhau + " " + thanhTien;
    }
}
