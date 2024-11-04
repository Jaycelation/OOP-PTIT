package TH8;

import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 13:22 by jayce
 */

/*8. DANH SÁCH LIÊN LẠC
Input
DANHSACH.in
Output
B21DCAT661 Hoang Tam Anh D21CQAT01-B anhht@gmail.com 0966554321
B21DCCN111 Ly Van Binh D21CQCN01-B binhlv@gmail.com 0978652142
B21DCCN123 Tran Van Toan D21CQCN01-B toantv@gmail.com 0987654321
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<sinhVien> list = new ArrayList<>();
        String maSinhVien, hoTen, lop, email, soDienThoai;
        while (sc.hasNextLine()) {
            maSinhVien = sc.nextLine();
            hoTen = sc.nextLine();
            lop = sc.nextLine();
            email = sc.nextLine();
            soDienThoai = sc.nextLine();
            list.add(new sinhVien(maSinhVien, hoTen, lop, email, soDienThoai));
        }
        Collections.sort(list, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getLop().compareTo(o2.getLop()) != 0) {
                    if (o1.getLop().compareTo(o2.getLop()) < 0) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    if (o1.getMaSinhVien().compareTo(o2.getMaSinhVien()) < 0) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
        });
        for (sinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}