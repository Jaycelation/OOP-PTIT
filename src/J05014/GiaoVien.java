package J05014;


import java.util.*;
import java.io.*;

public class GiaoVien {
    private String maGV, tenGV, maXT, trangThai;
    private double tongDiem;
    private String monXT;
    public GiaoVien(String maGV, String tenGV, String maXT, double tongDiem, String trangThai) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.maXT = maXT;
        this.tongDiem = tongDiem;
        this.trangThai = trangThai;
    }

    public String getMaGV() {
        return maGV;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    @Override
    public String toString() {
        char mon = maXT.charAt(0);
        if (mon == 'A') {
            this.monXT = "TOAN";
        } else if (mon == 'B') {
            this.monXT = "LY";
        } else if (mon == 'C') {
            this.monXT = "HOA";
        }
        return maGV + " " + tenGV + " " + monXT + " " + String.format("%.1f", tongDiem) + " " + trangThai;
    }
}
