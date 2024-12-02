package J05015;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Cuaro {
    private String ma, hoTen, donVi, thoiDiem;
    private long time, hours, minues;
    private double thoiGian;
    private int vanToc;
    public Cuaro(String ma, String hoTen, String donVi, String thoiDiem) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.donVi = donVi;
        this.thoiDiem = thoiDiem;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        try {
            long startMillis = simpleDateFormat.parse("06:00").getTime();
            long endMillis = simpleDateFormat.parse(thoiDiem).getTime();
            this.time = endMillis - startMillis;
            this.hours = TimeUnit.MILLISECONDS.toHours(time);
            this.minues = TimeUnit.MILLISECONDS.toMinutes(time) % 60;
            this.thoiGian = hours + minues / 60.0;
            double temp = 120 / thoiGian;
            if (temp - (int)temp > 0.5) {
                this.vanToc = (int)temp + 1;
            } else {
                this.vanToc = (int)temp;
            }
        } catch (ParseException e) {

        }
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + donVi + " " + vanToc + " Km/h";
    }
}
