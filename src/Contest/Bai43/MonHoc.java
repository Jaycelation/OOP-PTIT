package Contest.Bai43;


import java.util.*;
import java.io.*;

public class MonHoc {
    private String maMH, tenMH;
    private int soTC;

    public MonHoc(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public String getTenMH() {
        return tenMH;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + soTC;
    }
}
