package Contest.Bai12;


import java.util.*;
import java.io.*;

public class Phim {
    private String maPhim, tenPhim, tenTL, ngayChieu;
    private int soTap;

    public Phim(String maPhim, String tenPhim, String tenTL, String ngayChieu, int soTap) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.tenTL = tenTL;
        this.ngayChieu = ngayChieu;
        this.soTap = soTap;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getSoTap() {
        return soTap;
    }

    public String getNgayChieu() {
        String[] temp = ngayChieu.split("/");
        String ngay = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            ngay += temp[i];
        }
        return ngay;
    }

    @Override
    public String toString() {
        return maPhim + " " + tenTL + " " + ngayChieu + " " + tenPhim + " " + soTap;
    }
}
