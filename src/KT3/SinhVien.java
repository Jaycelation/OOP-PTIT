package KT3;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lopSV, gmailSV, sdtSV;

    public SinhVien(String maSV, String tenSV, String lopSV, String gmailSV, String sdtSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.gmailSV = gmailSV;
        this.sdtSV = sdtSV;
    }

    public String getLopSV() {
        return lopSV;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV + " " + gmailSV + " " + sdtSV;
    }
}
