package Contest.Bai34;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lop, email, sdt;

    public SinhVien(String maSV, String tenSV, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV;
    }
}
