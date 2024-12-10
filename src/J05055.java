import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class J05055 {
    public static class VanDongVien {
        private String maVDV, tenVDV, ngaySinh, thoiGianXP, thoiGianVD;
        private String thanhTich, uuTien, thanhTichXH;
        private long time, hours, minutes, seconds;
        public VanDongVien(String maVDV, String tenVDV, String ngaySinh, String thoiGianXP, String thoiGianVD) {
            this.maVDV = maVDV;
            this.tenVDV = tenVDV;
            this.ngaySinh = ngaySinh;
            this.thoiGianXP = thoiGianXP;
            this.thoiGianVD = thoiGianVD;

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            try {
                long startMillies = sdf.parse(thoiGianXP).getTime();
                long endMillies = sdf.parse(thoiGianVD).getTime();
                time = endMillies - startMillies;
                hours = TimeUnit.MILLISECONDS.toHours(time);
                minutes = TimeUnit.MILLISECONDS.toMinutes(time) % 60;
                seconds = TimeUnit.MILLISECONDS.toSeconds(time) % 60;
            } catch (ParseException e) {

            }
            this.thanhTich = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            int tuoi = 2021 - Integer.parseInt(ngaySinh.substring(6));
            long val = 0;
            if (tuoi < 18) {
                val = 0;
            } else if (tuoi >= 18 && tuoi < 25) {
                val = 1;
            } else if (tuoi >= 25 && tuoi < 32) {
                val = 2;
            } else if (tuoi >= 32) {
                val = 3;
            }
            this.uuTien = "00:00:0" + val;
            seconds -= val;
            if (seconds < 0) {
                seconds = 60 + seconds;
                minutes -= 1;
            }
            if (minutes < 0) {
                minutes = 60 + minutes;
                hours -= 1;
            }
            this.thanhTichXH = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        }

        public String getThanhTichXH() {
            return thanhTichXH;
        }

        @Override
        public String toString() {
            return maVDV + " " + tenVDV + " " + thanhTich + " " + uuTien + " " + thanhTichXH;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<VanDongVien> list = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            list.add(new VanDongVien("VDV" + String.format("%02d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        ArrayList<String> xepHang = new ArrayList<>();
        for (VanDongVien i : list) {
            xepHang.add(i.getThanhTichXH());
        }
        Collections.sort(xepHang);
        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for (String i : xepHang) {
            map.put(i, map.getOrDefault(i, count++));
        }

        for (VanDongVien i : list) {
            if (map.containsKey(i.getThanhTichXH())) {
                System.out.println(i + " " + map.get(i.getThanhTichXH()));
            }
        }

    }
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
 */