package J07050;


import java.util.*;
import java.io.*;

public class MatHang {
    private String maMH, tenMH, nhom;
    private double giaMua, giaBan;
    private double loiNhuan;

    public MatHang(String maMH, String tenMH, String nhom, double giaMua, double giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
