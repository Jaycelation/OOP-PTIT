package J07035;

import java.util.*;
import java.io.*;

/*
    Dùng map để lưu
    Truy vấn hỏi class nào thì tạo map ở class đó
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, SinhVien> mapSV = new HashMap<>();
        while (n-- > 0) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            mapSV.put(sinhVien.getMaSV(), sinhVien);
        }

        scanner = new Scanner(new File("MONHOC.in"));
        n = Integer.parseInt(scanner.nextLine());
        Map<String, MonHoc> mapMH = new HashMap<>();
        while (n-- > 0) {
            MonHoc monHoc = new MonHoc(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            mapMH.put(monHoc.getMaMH(), monHoc);
        }

        scanner = new Scanner(new File("BANGDIEM.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<BangDiem> listBD = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            SinhVien sinhVien = mapSV.get(line[0]);
            MonHoc monHoc = mapMH.get(line[1]);
            String diem = line[2];
            listBD.add(new BangDiem(sinhVien, monHoc, diem));
        }

        n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            list.add(scanner.nextLine());
        }

        for (String maMH : list) {
            MonHoc monHoc = mapMH.get(maMH);
            System.out.println("BANG DIEM MON " + monHoc.getTenMH() + ":");
            listBD.sort(Comparator.comparing(BangDiem::getDiem).reversed().thenComparing(BangDiem::getMaSV));
            for (BangDiem bangDiem : listBD) {
                if (bangDiem.getMonHoc().getMaMH().equals(maMH)) {
                    System.out.println(bangDiem);
                }
            }
        }

    }
}