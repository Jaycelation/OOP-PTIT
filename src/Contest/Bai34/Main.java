package Contest.Bai34;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (sc.hasNextLine()) {
            listSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), "0" + sc.nextLine()));
        }

        sc = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HuongDan> listHD = new ArrayList<>();
        while (n-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String tenGV = "";
            for (int i = 0; i < line.length-1; i++) {
                tenGV += line[i] + " ";
            }
            tenGV.substring(0, tenGV.length()-1);
            int soDT = Integer.parseInt(line[line.length-1]);
            SinhVien sinhVien = null;
            for (int i = 0; i < soDT; ++i) {
                String maSV = sc.next();
                String tenDT = sc.nextLine();
                for (SinhVien sv : listSV) {
                    if (sv.getMaSV().equals(maSV)) {
                        sinhVien = sv;
                        break;
                    }
                }
                listHD.add(new HuongDan(tenGV.trim(), tenDT.trim(), sinhVien));
            }
        }
        listHD.sort(Comparator.comparing(HuongDan::getMaSV));
        for (HuongDan hd : listHD) {
            System.out.println(hd);
        }
    }
}
