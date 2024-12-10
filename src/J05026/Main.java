package J05026;

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
            String tenMon = scanner.nextLine();
            String[] line = tenMon.toUpperCase().split("\\s+");
            String khoa = "";
            for (int i = 0; i < line.length; i++) {
                khoa += line[i].substring(0, 1);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + khoa + ":");
            for (GiangVien giangVien : list) {
                if (giangVien.getKhoa().equals(khoa)) {
                    System.out.println(giangVien);
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
Cong nghe phan mem
 */
