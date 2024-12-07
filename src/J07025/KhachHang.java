package J07025;


import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class KhachHang {
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;
    private String time;
    public KhachHang(String maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        String[] line = tenKH.trim().toLowerCase().split("\\s+");
        String temp = "";
        for (int i = 0; i < line.length; i++) {
            temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
            if (i != line.length - 1) {
                temp += " ";
            }
        }
        this.tenKH = temp;
        if (ngaySinh.charAt(1) == '/') {
            ngaySinh = "0" + ngaySinh;
        }
        if (ngaySinh.charAt(4) == '/') {
            ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
        }
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        String[] chuanHoa = ngaySinh.split("/");
        String date = "";
        for (int i = chuanHoa.length - 1; i >= 0; i--) {
            date += chuanHoa[i];
        }
        this.time = date;
        this.diaChi = diaChi;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }
}
