package J05025;


import java.util.*;
import java.io.*;

public class GiangVien {
    private String maGV, tenGV, khoa;

    public GiangVien(String maGV, String tenGV, String khoa) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        String[] line = khoa.toUpperCase().split("\\s+");
        String val = "";
        for (int i = 0; i < line.length; i++) {
            val += line[i].substring(0, 1);
        }
        this.khoa = val;
    }

    public String getTenGV() {
        String[] line = tenGV.split("\\s+");
        return line[line.length-1];
    }

    public String getMaGV() {
        return maGV;
    }

    @Override
    public String toString() {
        return maGV + " " + tenGV + " " + khoa;
    }
}
