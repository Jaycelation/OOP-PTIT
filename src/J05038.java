import java.util.*;
import java.io.*;

public class J05038 {
    public static class ThongKe {
        private String maNV, tenNV;
        private int luongNgay, soNgay;
        private String chucVu;
        private int luongThang, thuong, phuCap, thucLinh;

        public ThongKe(String maNV, String tenNV, int luongNgay, int soNgay, String chucVu) {
            this.maNV = maNV;
            this.tenNV = tenNV;
            this.luongNgay = luongNgay;
            this.soNgay = soNgay;
            this.chucVu = chucVu;
            this.luongThang = luongNgay * soNgay;
            if (soNgay >= 25) {
                thuong = 20 * luongThang / 100;
            } else if (soNgay >= 22) {
                thuong = 10 * luongThang / 100;
            } else if (soNgay < 22){
                thuong = 0;
            }
            if (chucVu.equals("GD")) {
                this.phuCap = 250000;
            } else if (chucVu.equals("PGD")) {
                this.phuCap = 200000;
            } else if (chucVu.equals("TP")) {
                this.phuCap = 180000;
            } else if (chucVu.equals("NV")) {
                this.phuCap = 150000;
            }
            this.thucLinh = luongThang + phuCap + thuong;
        }

        public int getThucLinh() {
            return thucLinh;
        }

        @Override
        public String toString() {
            return maNV + " " + tenNV + " " + luongThang + " " + thuong + " " + phuCap + " " + thucLinh;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ThongKe> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            list.add(new ThongKe("NV" + String.format("%02d", cnt++), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), scanner.nextLine()));
        }
        int val = 0;
        for (ThongKe t : list) {
            val += t.getThucLinh();
            System.out.println(t);
        }
        System.out.println("Tong chi phi tien luong: " + val);

    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
 */