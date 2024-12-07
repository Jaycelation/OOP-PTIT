package Contest.Bai24;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, sdt, gmail;

    public SinhVien(String maSV, String tenSV, String sdt, String gmail) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.gmail = gmail;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + sdt + " " + gmail;
    }
}
