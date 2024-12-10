package J07059;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class CaThi {
    private String ma, ngay, gio, phong;
    private long time;
    public CaThi(String ma, String ngay, String gio, String phong) {
        this.ma = ma;
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            String val = ngay + " " + gio;
            time = sdf.parse(val).getTime();
        } catch (ParseException e) {

        }
    }

    public long getTime() {
        return time;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ngay + " " + gio + " " + phong;
    }
}
