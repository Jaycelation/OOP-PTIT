package J07020;


import java.util.*;
import java.io.*;

public class MatHang {
    private String maMH, tenMH, donVi;
    private int giaMua, giaBan;

    public MatHang(String maMH, String tenMH, String donVi, int giaMua, int giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return tenMH + " " + donVi + " " + giaMua + " " + giaBan;
    }
}
