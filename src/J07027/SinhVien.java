package J07027;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, soDT;

    public SinhVien(String maSV, String tenSV, String soDT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.soDT = soDT;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + soDT;
    }
}
