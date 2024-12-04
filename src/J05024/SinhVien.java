package J05024;

import java.util.*;
import java.io.*;

public class SinhVien {
    private String maSV, tenSV, lopSV, email;
    public SinhVien(String maSV, String tenSV, String lopSV, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.email = email;
    }

    public String getNganhSV() {
        if (maSV.substring(3, 7).equals("DCKT")) {
            return "KE TOAN";
        } else if (maSV.substring(3, 7).equals("DCCN") && lopSV.charAt(0) != 'E') {
            return "CONG NGHE THONG TIN";
        } else if (maSV.substring(3, 7).equals("DCAT") && lopSV.charAt(0) != 'E') {
            return "AN TOAN THONG TIN";
        } else if (maSV.substring(3, 7).equals("DCVT")) {
            return "VIEN THONG";
        } else if (maSV.substring(3, 7).equals("DCDT")) {
            return "DIEN TU";
        }
        return "";
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV + " " + email;
    }
}
