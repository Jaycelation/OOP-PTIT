package Contest.Bai24;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (n-- > 0) {
            listSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        sc = new Scanner(new File("DETAI.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<DeTai> listDT = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            String maDT = "DT" + String.format("%03d", cnt++);
            listDT.add(new DeTai(maDT, sc.nextLine(), sc.nextLine()));
        }

        sc = new Scanner(new File("NHIEMVU.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<NhiemVu> listNV = new ArrayList<>();
        while (n-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            SinhVien sinhVien = null;
            DeTai deTai = null;
            String maSV = line[0];
            String maDT = line[1];
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
            listNV.add(new NhiemVu(deTai, sinhVien));
        }
        listNV.sort(Comparator.comparing(NhiemVu::getTenDT));
        for (NhiemVu nv : listNV) {
            System.out.println(nv);
        }
    }
}
