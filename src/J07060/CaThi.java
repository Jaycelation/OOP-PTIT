package J07060;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class CaThi {
    private String maCT, ngayThi, gioThi, maPhong;
    private String time;
    public CaThi(String maCT, String ngayThi, String gioThi, String maPhong) {
        this.maCT = maCT;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.maPhong = maPhong;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            String temp = ngayThi + " " + gioThi;
            Date date = sdf.parse(temp);
            this.time = sdf.format(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTime() {
        return time;
    }

    public String getMaCT() {
        return maCT;
    }

    @Override
    public String toString() {
        return ngayThi + " " + gioThi + " " + maPhong;
    }
}