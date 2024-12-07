package Contest.Bai34;


import java.util.*;
import java.io.*;

public class HuongDan {
    private String tenGV, tenDT;
    private SinhVien sinhVien;

    public HuongDan(String tenGV, String tenDT, SinhVien sinhVien) {
        this.tenGV = tenGV;
        this.tenDT = tenDT;
        this.sinhVien = sinhVien;
    }

    public String getMaSV() {
        return sinhVien.getMaSV();
    }

    @Override
    public String toString() {
        return sinhVien + " " + tenGV + " " + tenDT + " " + sinhVien.getSdt();
    }
}
