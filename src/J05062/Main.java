package J05062;


import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        ArrayList<SinhVien> listSV = new ArrayList<>();
        ArrayList<Double> listD = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String tenSV = scanner.nextLine();
            String[] words = scanner.nextLine().split("\\s+");
            double gpa = Double.parseDouble(words[0]);
            int diemRL = Integer.parseInt(words[1]);
            String loaiHB = "";
            if (gpa >= 3.6 && diemRL >= 90) {
                loaiHB = "XUATSAC";
            } else if (gpa >= 3.2 && diemRL >= 80) {
                loaiHB = "GIOI";
            } else if (gpa >= 2.5 && diemRL >= 70) {
                loaiHB = "KHA";
            } else {
                loaiHB = "KHONG";
            }
            listSV.add(new SinhVien(tenSV, gpa, diemRL, loaiHB));
            listD.add(gpa);
        }

        listD.sort(Comparator.comparing(Double::doubleValue).reversed());
        double temp = listD.get(m-1);
        for (SinhVien sv : listSV) {
            if (sv.getGpa() < temp) {
                sv.setLoaiHB("KHONG");
            }
        }

        for (SinhVien sv : listSV) {
            System.out.println(sv);
        }

    }
}
/*
5 3
Nguyen Van Nam
3.59 75
Tran Hong Ngoc
3.61 90
Do Van An
3.22 90
Dang Duc Tai
3.59 79
Nguyen Anh Tu
3.62 90
 */