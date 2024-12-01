package KT2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class CongNhan {
    private String maCN, tenCN, gioVao, gioRa, trangThai;
    private long thoiGian, gio, phut;

    public CongNhan(String maCN, String tenCN, String gioVao, String gioRa) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            long startMillis = sdf.parse(gioVao).getTime();
            long endMillis = sdf.parse(gioRa).getTime();
            this.thoiGian = endMillis - startMillis;
            this.gio = TimeUnit.MILLISECONDS.toHours(thoiGian) - 1;
            this.phut = TimeUnit.MILLISECONDS.toMinutes(thoiGian) % 60;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkTrangThai() {
        if (gio < 8) {
            trangThai = "THIEU";
        } else {
            trangThai = "DU";
        }
    }

    public String getMaCN() {
        return maCN;
    }

    public long getThoiGian() {
        return thoiGian;
    }

    @Override
    public String toString() {
        checkTrangThai();
        return maCN + " " + tenCN + " " + gio + " gio " + phut + " phut " + trangThai;
    }
}
