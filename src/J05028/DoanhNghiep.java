package J05028;


import java.util.*;
import java.io.*;

public class DoanhNghiep {
    private String maDN, tenDN;
    private int soSV;

    public DoanhNghiep(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    public String getMaDN() {
        return maDN;
    }

    public int getSoSV() {
        return soSV;
    }

    @Override
    public String toString() {
        return maDN + " " + tenDN + " " + soSV;
    }
}
