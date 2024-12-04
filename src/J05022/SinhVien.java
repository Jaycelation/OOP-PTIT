package J05022;


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

    public String getLopSV() {
        return lopSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lopSV + " " + email;
    }
}
