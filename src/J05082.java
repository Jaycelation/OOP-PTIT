import java.util.*;
import java.io.*;

public class J05082 {
    public static class KhachHang {
        private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

        public KhachHang(String maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
            this.maKH = maKH;
            this.gioiTinh = gioiTinh;
            if (ngaySinh.charAt(1) == '/') {
                ngaySinh = "0" + ngaySinh;
            }
            if (ngaySinh.charAt(4) == '/') {
                ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
            }
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            String[] line = tenKH.trim().toLowerCase().split("\\s+");
            String val = "";
            for (int i = 0; i < line.length; i++) {
                val += line[i].substring(0, 1).toUpperCase() + line[i].substring(1) + " ";
            }
            this.tenKH = val.substring(0, val.length() - 1);
        }

        public String getNgaySinh() {
            String[] temp = ngaySinh.split("/");
            return temp[2] + temp[1] + temp[0];
        }

        @Override
        public String toString() {
            return maKH + " " + tenKH + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            list.add(new KhachHang("KH" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        list.sort(Comparator.comparing(KhachHang::getNgaySinh));
        for (KhachHang khachHang : list) {
            System.out.println(khachHang);
        }

    }
}
/*
2
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
 */