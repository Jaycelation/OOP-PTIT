package Contest.Bai52;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lop, gmail, sdt;

    public SinhVien(String maSV, String tenSV, String lop, String gmail, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.gmail = gmail;
        this.sdt = sdt;
    }

    public String getLop() {
        return lop;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop + " " + gmail + " " + sdt;
    }
}
