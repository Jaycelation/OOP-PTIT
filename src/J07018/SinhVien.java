package J07018;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lopSV, ngaySinh;
    private double gpa;

    public SinhVien(String maSV, String tenSV, String lopSV, String ngaySinh, double gpa) {
        this.maSV = maSV;
        String[] line = tenSV.trim().toLowerCase().split("\\s+");
        String tmp = "";
        for (int i = 0; i < line.length; i++) {
            tmp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
            if (i != line.length - 1) {
                tmp += " ";
            }
        }
        this.tenSV = tmp;
        this.lopSV = lopSV;
        String temp = ngaySinh;
        if (ngaySinh.charAt(1) == '/') {
            temp = "0" + temp;
        }
        if (temp.charAt(4) == '/') {
            temp = temp.substring(0, 3) + "0" + temp.substring(3);
        }
        /*    01/5/2024  */
        this.ngaySinh = temp;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
