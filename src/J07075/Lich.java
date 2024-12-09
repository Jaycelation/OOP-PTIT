package J07075;


import java.util.*;
import java.io.*;

public class Lich {
    private String maNhom;
    private MonHoc monHoc;
    private String thu;
    private int kip;
    private String tenGV, phong;

    public Lich(String maNhom, MonHoc monHoc, String thu, int kip, String tenGV, String phong) {
        this.maNhom = maNhom;
        this.monHoc = monHoc;
        this.thu = thu;
        this.kip = kip;
        this.tenGV = tenGV;
        this.phong = phong;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getThu() {
        return thu;
    }

    public int getKip() {
        return kip;
    }

    @Override
    public String toString() {
        return maNhom + " " + monHoc + " " + thu + " " + kip + " " + phong;
    }
}
