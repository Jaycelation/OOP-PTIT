package J07036;


import java.util.*;
import java.io.*;

public class SinhVien {
    String maSV, tenSV, lop, gmail;

    public SinhVien(String maSV, String tenSV, String lop, String gmail) {
        this.maSV = maSV;
        this.lop = lop;
        this.gmail = gmail;
        String[] line = tenSV.trim().toLowerCase().split("\\s+");
        String temp = "";
        for (String s : line) {
            temp += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.tenSV = temp.trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV;
    }
}
