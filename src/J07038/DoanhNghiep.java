package J07038;


import java.util.*;
import java.io.*;

public class DoanhNghiep {
    private String maDN, tenDN;
    private int soLuong;

    public DoanhNghiep(String maDN, String tenDN, int soLuong) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soLuong = soLuong;
    }

    public String getMaDN() {
        return maDN;
    }

    public String getTenDN() {
        return tenDN;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
