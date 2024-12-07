package Contest.Bai24;


import java.util.*;
import java.io.*;

public class NhiemVu {
    private DeTai deTai;
    private SinhVien sinhVien;

    public NhiemVu(DeTai deTai, SinhVien sinhVien) {
        this.deTai = deTai;
        this.sinhVien = sinhVien;
    }

    public String getTenDT() {
        return deTai.getTenDT();
    }

    @Override
    public String toString() {
        return sinhVien + " " + deTai;
    }
}
