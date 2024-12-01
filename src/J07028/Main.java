package J07028;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maMH = line[0];
            String tenMH = "";
            for (int i = 1; i < line.length; i++) {
                tenMH += line[i];
                if (i != line.length - 1) {
                    tenMH += " ";
                }
            }
            listMH.add(new MonHoc(maMH, tenMH));
        }

        scanner = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<GiangVien> listGV = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maGV = line[0];
            String tenGV = "";
            for (int i = 1; i < line.length; i++) {
                tenGV += line[i];
                if (i != line.length - 1) {
                    tenGV += " ";
                }
            }
            listGV.add(new GiangVien(maGV, tenGV));
        }

        scanner = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(scanner.nextLine());
        HashMap<String, Double> map = new HashMap<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maGV = line[0];
            String maMH = line[1];
            double gioDay = Double.parseDouble(line[2]);
            if (map.containsKey(maGV)) {
                map.put(maGV, map.get(maGV) + gioDay);
            } else {
                map.put(maGV, gioDay);
            }
        }

        for (GiangVien gv : listGV) {
            System.out.println(gv + " " + String.format("%.2f", map.get(gv.getMaGV())));
        }

    }
}
