package ChamCong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class CongNhan {
    private String maCN, tenCN, gioVao, gioRa;
    private long time, hours, minutes;
    private String trangThai;
    public CongNhan(String maCN, String tenCN, String gioVao, String gioRa) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            long startMillis = sdf.parse(gioVao).getTime();
            long endMillis = sdf.parse(gioRa).getTime();
            this.time = endMillis - startMillis;
            this.hours = TimeUnit.MILLISECONDS.toHours(time) - 1;
            this.minutes = TimeUnit.MILLISECONDS.toMinutes(time) % 60;
        } catch (ParseException e) {

        }
        if (hours >= 8) {
            this.trangThai = "DU";
        } else {
            this.trangThai = "THIEU";
        }
    }

    public String getMaCN() {
        return maCN;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return maCN + " " + tenCN + " " + hours + " gio " + minutes + " phut " + trangThai;
    }
}