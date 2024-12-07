package J07035;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lop, email;
    private double diem;
    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        String[] word = tenSV.toLowerCase().trim().split("\\s+");
        String temp = "";
        for (int i = 0; i < word.length; i++) {
            temp += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if (i != word.length - 1) {
                temp += " ";
            }
        }
        this.tenSV = temp;
        this.lop = lop;
        this.email = email;
    }

    public String chuanHoa(double diem) {
        if (diem - (int)diem == 0) {
            return String.valueOf((int)diem);
        }
        return String.valueOf(diem);
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop + " " + chuanHoa(diem);
    }
}
