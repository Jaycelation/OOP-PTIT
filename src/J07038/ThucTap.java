package J07038;


import java.util.*;
import java.io.*;

public class ThucTap {
    private SinhVien sinhVien;
    private DoanhNghiep doanhNghiep;

    public ThucTap(SinhVien sinhVien, DoanhNghiep doanhNghiep) {
        this.sinhVien = sinhVien;
        this.doanhNghiep = doanhNghiep;
    }

    public String getMaDN() {
        return doanhNghiep.getMaDN();
    }

    public String getMaSV() {
        return sinhVien.getMaSV();
    }

    @Override
    public String toString() {
        return sinhVien.toString();
    }
}
