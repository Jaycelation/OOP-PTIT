package J07020;


import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/J07020/KH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listKH.add(new KhachHang(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        scanner = new Scanner(new File("src/J07020/MH.in"));
        ArrayList<MatHang> listMH = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            listMH.add(new MatHang(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }

        scanner = new Scanner(new File("src/J07020/HD.in"));

        ArrayList<HoaDon> listHD = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String idKH = line[0];
            String idMH = line[1];
            int count = Integer.parseInt(line[2]);
            KhachHang kh = null;
            for (KhachHang khachHang : listKH) {
                if (khachHang.getId().equals(idKH)) {
                    kh = khachHang;
                    break;
                }
            }
            MatHang mh = null;
            for (MatHang matHang : listMH) {
                if (matHang.getId().equals(idMH)) {
                    mh = matHang;
                    break;
                }
            }
            listHD.add(new HoaDon(kh, mh, count));
        }
        for (HoaDon hoaDon : listHD) {
            System.out.println(hoaDon);
        }
    }
}
