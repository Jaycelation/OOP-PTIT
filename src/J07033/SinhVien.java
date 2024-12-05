package J07033;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lopSV, emailSV;

    public SinhVien(String maSV, String tenSV, String lopSV, String emailSV) {
        this.maSV = maSV;
        String[] line = tenSV.trim().toLowerCase().split("\\s+");
        String temp = "";
        for (int i = 0; i < line.length; i++) {
            temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
            if (i != line.length - 1) {
                temp += " ";
            }
        }
        this.tenSV = temp;
        this.lopSV = lopSV;
        this.emailSV = emailSV;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV + " " + emailSV;
    }

}
