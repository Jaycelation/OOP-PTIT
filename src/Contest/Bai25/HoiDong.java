package Contest.Bai25;


import java.util.*;
import java.io.*;

public class HoiDong {
    private SinhVien sinhVien;
    private DeTai deTai;
    private String maHD;

    public HoiDong(SinhVien sinhVien, DeTai deTai, String maHD) {
        this.sinhVien = sinhVien;
        this.deTai = deTai;
        this.maHD = maHD;
    }

    @Override
    public String toString() {
        return sinhVien + " " + deTai;
    }
}
