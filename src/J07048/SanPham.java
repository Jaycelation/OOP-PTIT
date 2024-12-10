package J07048;


import java.util.*;
import java.io.*;

public class SanPham {
    private String maSP, tenSP;
    private int giaBan, baoHanh;

    public SanPham(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + giaBan + " " + baoHanh;
    }
}
