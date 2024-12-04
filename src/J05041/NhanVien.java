package J05041;


import java.util.*;
import java.io.*;

public class NhanVien {
    private String maNV, tenNV;
    private int luongCB, soNgayCong;
    private String chucVu;

    public NhanVien(String maNV, String tenNV, int luongCB, int soNgayCong, String chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public int luongThang() {
        return luongCB * soNgayCong;
    }

    public int thuong() {
        if (this.soNgayCong >= 25) {
            return (int) (luongThang() * 0.2);
        } else if (this.soNgayCong >= 22) {
            return (int) (luongThang() * 0.1);
        } else {
            return 0;
        }
    }

    public int phuCap() {
        if (this.chucVu.compareTo("GD") == 0) {
            return 250000;
        } else if (this.chucVu.compareTo("PGD") == 0) {
            return 200000;
        } else if (this.chucVu.compareTo("TP") == 0) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public int thuNhap() {
        return luongThang() + thuong() + phuCap();
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + thuNhap();
    }
}
