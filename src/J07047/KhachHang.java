package J07047;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang {
    private String maKH, tenKH, maP, ngayDen, ngayDi;
    private LoaiPhong phong;
    private long time, days;
    private double money;

    public KhachHang(String maKH, String tenKH, String maP, String ngayDen, String ngayDi, LoaiPhong phong) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maP = maP;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            long timeStart = sdf.parse(ngayDen).getTime();
            long timeEnd = sdf.parse(ngayDi).getTime();
            time = timeEnd - timeStart;
            days = time / (24 * 60 * 60 * 1000);
            if (days == 0) {
                this.money = phong.getDonGia() * (1 + phong.getPhiPV());
            } else {
                this.money = phong.getDonGia() * days * (1 + phong.getPhiPV());
                if (days < 10) {
                    this.money = this.money;
                } else if (days >= 10 && days < 20) {
                    this.money = this.money * (1 - 0.02);
                } else if (days >= 20 && days < 30) {
                    this.money = this.money * (1 - 0.04);
                } else {
                    this.money = this.money * (1 - 0.06);
                }
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public long getDays() {
        return this.days;
    }

    @Override
    public String toString() {
        if (days == 1) {
            days = 0;
        }
        return maKH + " " + tenKH + " " + maP + " " + days + " " + String.format("%.2f", money);
    }
}