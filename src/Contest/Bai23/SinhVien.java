package Contest.Bai23;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class SinhVien {
    private String tenSV, thoiGianBD, thoiGianKT;
    private long time, hours, minutes;
    public SinhVien(String tenSV, String thoiGianBD, String thoiGianKT) {
        this.tenSV = tenSV;
        this.thoiGianBD = thoiGianBD;
        this.thoiGianKT = thoiGianKT;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            long startMillis = sdf.parse(thoiGianBD).getTime();
            long endMillis = sdf.parse(thoiGianKT).getTime();
            this.time = endMillis - startMillis;
            this.hours = TimeUnit.MILLISECONDS.toHours(time);
            this.minutes = TimeUnit.MILLISECONDS.toMinutes(time);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTenSV() {
        return tenSV;
    }

    public long getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return tenSV + " " + minutes;
    }
}

