package Contest.Bai49;


import java.util.*;
import java.io.*;

public class MonHoc {
    private String maMH, tenMH, hinhThucThi;

    public MonHoc(String maMH, String tenMH, String hinhThucThi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMH() {
        return maMH;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + hinhThucThi;
    }
}
