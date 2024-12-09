package J07036;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, SinhVien> mapSV = new HashMap<>();
        while (n-- > 0) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            mapSV.put(sinhVien.getMaSV(), sinhVien);
        }

        scanner = new Scanner(new File("MONHOC.in"));
        HashMap<String, MonHoc> mapMH = new HashMap<>();
        n = Integer.parseInt(scanner.nextLine());
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
        ArrayList<String> listLop = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listLop.add(scanner.nextLine());
        }

        for (String lop : listLop) {
            System.out.println("BANG DIEM lop " + lop + ":");
            listBD.sort(Comparator.comparing(BangDiem::getMaMH).thenComparing(BangDiem::getMaSV));
            for (BangDiem bd : listBD) {
                if (bd.getLop().equals(lop)) {
                    System.out.println(bd);
                }
            }
        }

    }
}
