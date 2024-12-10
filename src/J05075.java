import java.util.*;
import java.io.*;

public class J05075 {
    public static class SinhVien {
        private String maSV, tenSV, lop;
        private int diemCC;

        public SinhVien(String maSV, String tenSV, String lop) {
            this.maSV = maSV;
            this.tenSV = tenSV;
            this.lop = lop;
        }

        public void setDiemCC(int diemCC) {
            this.diemCC = diemCC;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getLop() {
            return lop;
        }

        @Override
        public String toString() {
            if (diemCC == 0) {
                return maSV + " " + tenSV + " " + lop + " " + diemCC + " " + "KDDK";
            }
            else {
                return maSV + " " + tenSV + " " + lop + " " + diemCC;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = n;
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        while (m-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maSV = line[0];
            String diemDanh = line[1];
            SinhVien sinhVien = null;
            for (SinhVien i : list) {
                if (i.maSV.equals(maSV)) {
                    sinhVien = i;
                    sinhVien.setDiemCC(tinhDiemCC(diemDanh));
                    break;
                }
            }
        }
        String lop = scanner.nextLine();
        for (SinhVien i : list) {
            if (i.getLop().equals(lop)) {
                System.out.println(i);
            }
        }

    }
    public static int tinhDiemCC(String s) {
        int val = 10;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'v') {
                val -= 2;
            } else if (c == 'm') {
                val -= 1;
            }
        }
        if (val < 0) {
            val = 0;
        }
        return  val;
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
 */