package J05017;


import java.util.*;
import java.io.*;

public class HoaDon {
    private String maKH, tenKH;
    private int chiSoCu, chiSoMoi;
    public HoaDon(String maKH, String tenKH, int chiSoCu, int chiSoMoi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public long tinhTien(int chiSoCu, int chiSoMoi) {
        int soKhoi = chiSoMoi - chiSoCu;
        if(soKhoi > 100){
            return Math.round((50 * 100 + 50 * 150 + (soKhoi - 100) * 200) * (105.0/100.0));
        }else if(soKhoi > 50){
            return Math.round((50 * 100 + (soKhoi - 50) * 150) * (103.0/100.0));
        }else{
            return Math.round(soKhoi * 100 * (102.0/100.0));
        }
    }

    public double getTongTien() {
        return tinhTien(chiSoCu, chiSoMoi);
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + tinhTien(chiSoCu, chiSoMoi);
    }
}
