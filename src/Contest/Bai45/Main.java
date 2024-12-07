package Contest.Bai45;


import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            String maSV = "PH" + String.format("%02d", cnt++);
            String temp = sc.nextLine().trim().toLowerCase();
            String[] words = temp.split("\\s+");

            StringBuilder tenSV = new StringBuilder();
            for (String word : words) {
                tenSV.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1)).append(" ");
            }
            tenSV.setLength(tenSV.length() - 1);

            String ngaySinh = sc.nextLine().trim();
            if (ngaySinh.charAt(1) == '/') {
                ngaySinh = "0" + ngaySinh;
            }
            if (ngaySinh.charAt(4) == '/') {
                ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
            }

            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());

            listSV.add(new SinhVien(maSV, tenSV.toString(), ngaySinh, diem1, diem2));
        }

        for (SinhVien sv : listSV) {
            System.out.println(sv);
        }
    }
}