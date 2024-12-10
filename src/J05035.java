import java.util.*;
import java.io.*;

public class J05035 {
    public static class SinhVien {
        private int stt;
        private String maSV, tenSV, lop, email, doanhNghiep;

        public SinhVien(int stt, String maSV, String tenSV, String lop, String email, String doanhNghiep) {
            this.stt = stt;
            this.maSV = maSV;
            this.tenSV = tenSV;
            this.lop = lop;
            this.email = email;
            this.doanhNghiep = doanhNghiep;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getDoanhNghiep() {
            return doanhNghiep;
        }

        @Override
        public String toString() {
            return stt + " " + maSV + " " + tenSV + " " + lop + " " + email + " " + doanhNghiep;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            list.add(new SinhVien(cnt++, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        list.sort(Comparator.comparing(SinhVien::getMaSV));
        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String doanhNghiep = scanner.nextLine();
            for (SinhVien sv : list) {
                if (sv.getDoanhNghiep().equals(doanhNghiep)) {
                    System.out.println(sv);
                }
            }
        }

    }
}
