package J07020;


import java.util.*;
import java.io.*;

public class HoaDon {
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;
    private int thanhTien;

    public HoaDon(String maHD, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.thanhTien = soLuong * matHang.getGiaBan();
    }

    @Override
    public String toString() {
        return maHD + " " + khachHang + " " + matHang + " " + soLuong + " " + thanhTien;
    }
}
