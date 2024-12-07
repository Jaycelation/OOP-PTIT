package Contest.Bai25;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (n-- > 0) {
            listSV.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        scanner = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<DeTai> listDT = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            String maDT = "DT" + String.format("%03d", cnt++);
            listDT.add(new DeTai(maDT, scanner.nextLine(), scanner.nextLine()));
        }
        scanner = new Scanner(new File("HOIDONG.in"));
        ArrayList<HoiDong> listHD = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine());
        Map<String, HoiDong> mapHD = new HashMap<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maSV = line[0];
            String maDT = line[1];
            String maHD = line[2];
            SinhVien sinhVien = null;
            DeTai deTai = null;
            for (SinhVien sv : listSV) {
                if (sv.getMaSV().equals(maSV)) {
                    sinhVien = sv;
                    break;
                }
            }
            for (DeTai dt : listDT) {
                if (dt.getMaDT().equals(maDT)) {
                    deTai = dt;
                    break;
                }
            }
            listHD.add(new HoiDong(sinhVien, deTai, maHD));
            
        }



    }
}
