package J05019;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class LuongMua {
    private String maKV, tenKV, thoiGianBD, thoiGianKT;
    private int chiSo;
    private long time, hours, minutes;
    public LuongMua(String maKV, String tenKV, String thoiGianBD, String thoiGianKT, int chiSo) {
        this.maKV = maKV;
        this.tenKV = tenKV;
        this.thoiGianBD = thoiGianBD;
        this.thoiGianKT = thoiGianKT;
        this.chiSo = chiSo;

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        try {
            long startMillis = formatter.parse(thoiGianBD).getTime();
            long endMillis = formatter.parse(thoiGianKT).getTime();
            this.time = endMillis - startMillis;
            this.hours = TimeUnit.MILLISECONDS.toHours(time);
            this.minutes = TimeUnit.MILLISECONDS.toMinutes(time) % 60;
        } catch (ParseException e) {

        }

    }

    public String getTenKV() {
        return tenKV;
    }

    public double getChiSo() {
        double soGio = hours + (double) minutes / 60;
        return chiSo / soGio;
    }

    @Override
    public String toString() {
        return maKV + " " + tenKV + " " + String.format("%.2f", getChiSo());
    }
}
