package J07035;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/J07035/SINHVIEN.in"));
        ArrayList<SinhVien> listSV = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            listSV.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        scanner = new Scanner(new File("src/J07035/MONHOC.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        while (n-- > 0) {
            String maMH = scanner.nextLine();
            String tenMH = scanner.nextLine();
            int soTC = Integer.parseInt(scanner.nextLine());
            listMH.add(new MonHoc(maMH, tenMH, soTC));
        }

        scanner = new Scanner(new File("src/J07035/BANGDIEM.in"));
        n = Integer.parseInt(scanner.nextLine());
        Map<String, SinhVien> map = new HashMap<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maSV = line[0];
            String maMH = line[1];
            double diem = Double.parseDouble(line[2]);
            SinhVien sv = null;
            for (SinhVien s : listSV) {
                if (maSV.equals(s.getMaSV())) {
                    s.setDiem(diem);
                    sv = s;
                    break;
                }
            }
            map.put(maMH, sv); //Map (MaMH, SV)
        }

        n = Integer.parseInt(scanner.nextLine());
        listSV.sort(Comparator.comparing(SinhVien::getDiem).reversed().thenComparing(SinhVien::getMaSV));
        while (n-- > 0) {
            String maMH = scanner.nextLine();
            for (MonHoc mh : listMH) {
                if (mh.getMaMH().equals(maMH)) {
                    System.out.println("BANG DIEM MON " + mh.getTenMH() + ":");
                    for (SinhVien sv : listSV) {
                
                    }
                }
            }
        }
    }
}
