package J07027;


import java.util.*;
import java.io.*;

public class Nhom {
    private SinhVien sinhVien;
    private BaiTap baiTap;

    public Nhom(SinhVien sinhVien, BaiTap baiTap) {
        this.sinhVien = sinhVien;
        this.baiTap = baiTap;
    }

    public String getMaSV() {
        return sinhVien.getMaSV();
    }

    @Override
    public String toString() {
        return sinhVien + " " + baiTap;
    }
}
