package TH9;


import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 13:41 by jayce
 */

public class sinhVien {
    private String hoTen;
    private int soBai, soSub;

    public sinhVien(String hoTen, int soBai, int soSub) {
        this.hoTen = hoTen;
        this.soBai = soBai;
        this.soSub = soSub;
    }

    public int getSoBai() {
        return soBai;
    }

    public int getSoSub() {
        return soSub;
    }

    public String getHoTen() {
        return hoTen;
    }

    @Override
    public String toString() {
        return this.hoTen + " " + this.soBai + " " + this.soSub;
    }
}
