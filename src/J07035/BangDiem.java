package J07035;


import java.util.*;
import java.io.*;

public class BangDiem {
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private double diem;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, double diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return sinhVien + " " + (diem == (int) diem ? String.valueOf((int) diem) : String.valueOf(diem));
    }
}
