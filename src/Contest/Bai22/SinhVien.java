package Contest.Bai22;


import java.util.*;
import java.io.*;

public class SinhVien {
    private String tenSV;
    private int baiDung, soSub;

    public SinhVien(String tenSV, int baiDung, int soSub) {
        this.tenSV = tenSV;
        this.baiDung = baiDung;
        this.soSub = soSub;
    }

    public int getBaiDung() {
        return baiDung;
    }

    public int getSoSub() {
        return soSub;
    }

    public String getTenSV() {
        return tenSV;
    }

    @Override
    public String toString() {
        return tenSV + " " + baiDung + " " + soSub;
    }
}
