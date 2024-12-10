package J07038;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        Map<String, SinhVien> mapSV = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            mapSV.put(sinhVien.getMaSV(), sinhVien);
        }

        scanner = new Scanner(new File("DN.in"));
        n = Integer.parseInt(scanner.nextLine());
        Map<String, DoanhNghiep> mapDN = new HashMap<>();
        while (n-- > 0) {
            DoanhNghiep doanhNghiep = new DoanhNghiep(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            mapDN.put(doanhNghiep.getMaDN(), doanhNghiep);
        }

        scanner = new Scanner(new File("THUCTAP.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<ThucTap> listTT = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            SinhVien sinhVien = mapSV.get(line[0]);
            DoanhNghiep doanhNghiep = mapDN.get(line[1]);
            listTT.add(new ThucTap(sinhVien, doanhNghiep));
        }

        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String maDN = scanner.nextLine();
            DoanhNghiep doanhNghiep = mapDN.get(maDN);
            System.out.println("DANH SACH THUC TAP TAI " + doanhNghiep.getTenDN() + ":");
            listTT.sort(Comparator.comparing(ThucTap::getMaSV));
            int count = doanhNghiep.getSoLuong();
            for (ThucTap thucTap : listTT) {
                if (thucTap.getMaDN().equals(maDN)) {
                    count--;
                    System.out.println(thucTap);
                    if (count == 0) {
                        break;
                    }
                }
            }
        }

    }
}