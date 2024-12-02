package J05017;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<HoaDon> listHD = new ArrayList<>();
        int cnt = 1;
        while (n -- > 0) {
            String maKH = "KH" + String.format("%02d", cnt++);
            String tenKH = scanner.nextLine();
            int chiSoCu = Integer.parseInt(scanner.nextLine());
            int chiSoMoi = Integer.parseInt(scanner.nextLine());
            listHD.add(new HoaDon(maKH, tenKH, chiSoCu, chiSoMoi));
        }

        listHD.sort(Comparator.comparing(HoaDon::getTongTien).reversed());

        for (HoaDon hoaDon : listHD) {
            System.out.println(hoaDon);
        }

    }
}
/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
 */