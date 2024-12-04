package J05062;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String tenSV;
    private double gpa;
    private int diemRL;
    private String loaiHB;
    public SinhVien(String tenSV, double gpa, int diemRL, String loaiHB) {
        this.tenSV = tenSV;
        this.gpa = gpa;
        this.diemRL = diemRL;
        this.loaiHB = loaiHB;
    }

    public void setLoaiHB(String loaiHB) {
        this.loaiHB = loaiHB;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return tenSV + ": " + loaiHB;
    }
}
