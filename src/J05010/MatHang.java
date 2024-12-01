package J05010;


import java.util.*;
import java.io.*;

public class MatHang {
    private int maMH;
    private String tenMH, nhomH;
    private double giaMua, giaBan;

    public MatHang(int maMH, String tenMH, String nhomH, double giaMua, double giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomH = nhomH;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double getLoiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + nhomH + " " + String.format("%.2f", giaBan - giaMua
        );
    }
}
