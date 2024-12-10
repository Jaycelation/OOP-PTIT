package J07020;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            listKH.add(new KhachHang("KH" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        scanner = new Scanner(new File("MH.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        cnt = 1;
        while (n-- > 0) {
            listMH.add(new MatHang("MH" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }
        ArrayList<HoaDon> listHD = new ArrayList<>();
        scanner = new Scanner(new File("HD.in"));
        n = Integer.parseInt(scanner.nextLine());
        cnt = 1;
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maKH = line[0];
            String maMH = line[1];
            int soLuong = Integer.parseInt(line[2]);
            KhachHang khachHang = null;
            MatHang matHang = null;
            for (KhachHang i : listKH) {
                if (i.getMaKH().equals(maKH)) {
                    khachHang = i;
                    break;
                }
            }
            for (MatHang i : listMH) {
                if (i.getMaMH().equals(maMH)) {
                    matHang = i;
                    break;
                }
            }
            listHD.add(new HoaDon("HD" + String.format("%03d", cnt++), khachHang, matHang, soLuong));
        }

        for (HoaDon i : listHD) {
            System.out.println(i);
        }

    }
}
