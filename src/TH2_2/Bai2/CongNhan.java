package TH2_2.Bai2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CongNhan {
    private String id;
    private String name;
    private String gioVao;
    private String gioRa;

    public CongNhan(String id, String name, String gioVao, String gioRa) {
        this.id = id;
        this.name = name;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public long soPhut() {
        LocalTime x = LocalTime.parse(gioVao, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime y = LocalTime.parse(gioRa, DateTimeFormatter.ofPattern("HH:mm"));
        long minutes = Duration.between(x, y).toMinutes();
        return minutes;
    }

    public String gioLam() {
        long m = soPhut() - 60;
        long gio = m / 60;
        long phut = m - gio * 60;
        return gio + " gio " + phut + " phut";
    }

    public String trangThai() {
        String[] time = gioLam().split("\\s+");
        if (time[0].length() == 1) {
            int gio = Integer.parseInt(time[0]);
            if (gio >= 8) {
                return "DU";
            } else {
                return "THIEU";
            }
        } else {
            return "DU";
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gioLam() + " " + trangThai();
    }
}
