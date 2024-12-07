package J07034;


import java.util.*;
import java.io.*;

public class MonHoc {
    private String maMH, tenMH;
    private int soTin;

    public MonHoc(String maMH, String tenMH, int soTin) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTin = soTin;
    }

    public String getTenMH() {
        return tenMH;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + soTin;
    }
}
