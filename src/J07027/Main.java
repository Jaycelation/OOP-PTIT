package J07027;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> listSV = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            listSV.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        scanner = new Scanner(new File("BAITAP.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<BaiTap> listBT = new ArrayList<>();
        int count = 1;
        while (n-- > 0) {
            listBT.add(new BaiTap(count++, scanner.nextLine()));
        }

        scanner = new Scanner(new File("NHOM.in"));
        ArrayList<Nhom> listN = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String [] line = scanner.nextLine().split("\\s+");
            String maSV = line[0];
            int id = Integer.parseInt(line[1]);
            SinhVien sinhVien = null;
            BaiTap baiTap = null;
            for (SinhVien sv : listSV) {
                if (maSV.equals(sv.getMaSV())) {
                    sinhVien = sv;
                    break;
                }
            }
            for (BaiTap bt : listBT) {
                if (id == bt.getId()) {
                    baiTap = bt;
                    break;
                }
            }
            listN.add(new Nhom(sinhVien, baiTap));
        }
        listN.sort(Comparator.comparing(Nhom::getMaSV));
        for (Nhom nh : listN) {
            System.out.println(nh);
        }

    }
}
