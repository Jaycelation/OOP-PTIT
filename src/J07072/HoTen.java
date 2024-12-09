package J07072;


import java.util.*;
import java.io.*;

public class HoTen {
    private String ho, tenDem, ten;
    private String hoTenCH;
    public HoTen(String hoTen) {
        String[] line = hoTen.trim().toLowerCase().split("\\s+");
        String temp = "";
        String val = "";
        this.ho = line[0];
        this.ten = line[line.length - 1];
        for (int i = 1; i < line.length-1; i++) {
            val += line[i];
        }
        this.tenDem = val;
        for (int i = 0; i < line.length; i++) {
            temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1) + " ";
        }
        this.hoTenCH = temp.trim();
    }

    public String getHo() {
        return ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return hoTenCH;
    }
}
