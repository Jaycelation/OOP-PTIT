package J05027;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            list.add(new GiangVien("GV" + String.format("%02d", cnt++), scanner.nextLine(), scanner.nextLine()));
        }

        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String val = scanner.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + val + ":");
            for (GiangVien gv : list) {
                if (gv.getTenGV().toLowerCase().contains(val.toLowerCase())) {
                    System.out.println(gv);
                }
            }
        }

    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
 */