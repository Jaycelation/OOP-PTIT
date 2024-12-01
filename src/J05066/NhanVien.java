package J05066;


import java.util.*;
import java.io.*;

public class NhanVien {
    private String hoTen, chucVu, heSoLuong, soHieuNV;
    public NhanVien(String hoTen, String chucVu, String heSoLuong, String soHieuNV) {
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.soHieuNV = soHieuNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getHeSoLuong() {
        return heSoLuong;
    }

    public String getSoHieuNV() {
        return soHieuNV;
    }

    @Override
    public String toString() {
        return hoTen + " " + chucVu + " " + soHieuNV + " " + heSoLuong;
    }
}
