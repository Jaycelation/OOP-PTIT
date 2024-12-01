package J05012;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> listHD = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            long chietKhau = Long.parseLong(sc.nextLine());
            listHD.add(new HoaDon(id, name, soLuong, donGia, chietKhau));
        }

        listHD.sort(Comparator.comparing(HoaDon::getTongTien).reversed());
        for (HoaDon hoaDon : listHD) {
            System.out.println(hoaDon);
        }

    }
}
/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
 */
