package J07038;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lop, gmail;

    public SinhVien(String maSV, String tenSV, String lop, String gmail) {
        this.maSV = maSV;
        String[] line = tenSV.trim().toLowerCase().split("\\s+");
        String temp = "";
        for (int i = 0; i < line.length; i++) {
            temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1) + " ";
        }
        this.tenSV = temp.substring(0, temp.length() - 1);
        this.lop = lop;
        this.gmail = gmail;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop;
    }
}
