package J05012;


import java.util.*;
import java.io.*;

public class HoaDon {
    private String id, name;
    private long soLuong, donGia, chietKhau;

    public HoaDon(String id, String name, long soLuong, long donGia, long chietKhau) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public long tongTien() {
        return donGia * soLuong - chietKhau;
    }

    public long getTongTien() {
        return tongTien();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien();
    }
}
