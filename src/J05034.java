import java.util.*;
import java.io.*;

public class J05034 {
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

        public String getTenSV() {
            return tenSV;
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
        list.sort(Comparator.comparing(SinhVien::getTenSV));
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
/*
6
B17DCCN016
Le Khac Tuan Anh
D17HTTT2
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107
Dao Thanh Dat
D17CNPM5
test2@stu.ptit.edu.vn
FPT
B17DCAT092
Cao Danh Huy
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388
Cao Sy Hai Long
D17CNPM2
test4@stu.ptit.edu.vn
VNPT
B17DCCN461
Dinh Quang Nghia
D17CNPM2
test5@stu.ptit.edu.vn
FPT
B17DCCN554
Bui Xuan Thai
D17CNPM1
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
 */