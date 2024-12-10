package J07020;


import java.util.*;
import java.io.*;

public class KhachHang {
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    @Override
    public String toString() {
        return tenKH + " " + diaChi ;
    }
}
