package J07010;
import java.util.*;
import java.io.*;

/**
 * Create on 01/10/2024 19:32 by jayce
 */

public class sinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private double gpa;

    public sinhVien() {
    }
    public sinhVien(String maSV, String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public String chuanHoaNS(String ngaySinh){
        if (ngaySinh.charAt(2) != '/') {
            ngaySinh = "0" + ngaySinh;
        }
        if (ngaySinh.charAt(5) != '/') {
            ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
        }
        return ngaySinh;
    }
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + chuanHoaNS(this.ngaySinh) + " " + String.format("%.2f", this.gpa);
    }
}
