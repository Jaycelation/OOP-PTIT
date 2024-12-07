package Contest.Bai27;


import java.util.*;
import java.io.*;

public class GiangVien {
    private String maGV, tenGV;
    private double gioDay;
    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public double getGioDay() {
        return gioDay;
    }

    public void setGioDay(double gioDay) {
        this.gioDay = gioDay;
    }

    @Override
    public String toString() {
        return tenGV + " " + String.format("%.2f", gioDay);
    }
}
